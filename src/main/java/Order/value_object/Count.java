package Order.value_object;

import book.value_object.Din;
import common.Result;
import common.ValueObject;

public class Count extends ValueObject<Count> {

    private final double value;

    private Count(double value){
        this.value=value;
    }

    public static Result<Count> of(double value) {
        //validation
        if(value<=0) return  Result.Failed("Price is invalid,cant be less or equals to 0");
        return Result.Ok(new Count(value));
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
