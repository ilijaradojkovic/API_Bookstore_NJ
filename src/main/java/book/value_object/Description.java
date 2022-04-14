package book.value_object;

import common.Result;
import common.ValueObject;

import java.util.Objects;

public class Description extends ValueObject<Description> {

    private final String value;

     private static final int maxLength  = 100;

    private Description(String value){
        this.value=value;
    }
    public static Result<Description> Create(String value){
        //valiation

        if(value==null   || value.length()>maxLength  ) return Result.Failed("Description is in invalid format");
        return Result.Ok(new Description(value));
    }


    public String  getValue() {
        return value;
    }


    @Override
    protected int hashCodeCore() {
        return value.hashCode();
    }

    @Override
    protected boolean equalsCore(Object obj) {
        String valueOther=obj.toString();
        return Objects.equals(value, valueOther);
    }
}
