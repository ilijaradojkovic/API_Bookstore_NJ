package common;

import java.util.GregorianCalendar;

public class Result<T>{

    private T entity;
    private String message;
    private GregorianCalendar generatedTime;

    public boolean isSuccess (){
        return entity!=null;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GregorianCalendar getGeneratedTime() {
        return generatedTime;
    }

    public void setGeneratedTime(GregorianCalendar generatedTime) {
        this.generatedTime = generatedTime;
    }

    private Result(T entity, String message) {
        this.entity = entity;
        this.message = message;
        this.generatedTime = new GregorianCalendar();
    }

    public static <Y> Result<Y>  Ok( Y entity){
        return new Result<Y>(entity,"");
    }

    public static <Y> Result<Y>  Failed(String message){
        return new Result<Y>(null,message);
    }

    public static boolean Combined(Result... args){
        for (Result result: args
             ) {

            if(!result.isSuccess()) return false;

        }
        return  true;
    }

}
