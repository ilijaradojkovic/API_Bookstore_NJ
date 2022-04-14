package book.value_object;

import common.Result;
import common.ValueObject;

public class Pages extends ValueObject<Pages> {

    private final int value;

    private Pages(int value){
        this.value=value;
    }
    public static  Result<Pages> Create(int value)  {
        //valiation
        if(value<=0) return  Result.Failed("Pages are invalid,cant be less or equals to 0");
        return Result.Ok(new Pages(value));
    }


    public double getValue() {
        return value;
    }


    @Override
    protected int hashCodeCore() {
        return 0;
    }

    @Override
    protected boolean equalsCore(Object obj) {
        int valueOther=(int) obj;
        return valueOther==value;
    }
}
