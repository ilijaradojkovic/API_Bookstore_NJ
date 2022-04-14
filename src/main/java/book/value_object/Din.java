package book.value_object;

import common.Result;
import common.ValueObject;

public class Din extends ValueObject<Din> {

    private final double value;

    private Din(double value){
        this.value=value;
    }

    public static Result<Din> of(double value) {
        //validation
        if(value<=0) return  Result.Failed("Price is invalid,cant be less or equals to 0");
        return Result.Ok(new Din(value));
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
       double valueOther=(double) obj;
       return valueOther==value;
    }
}
