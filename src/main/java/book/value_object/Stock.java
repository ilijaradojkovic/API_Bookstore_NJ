package book.value_object;

import common.Result;
import common.ValueObject;

public class Stock extends ValueObject<Stock> {
    private final int value;

    private Stock(int value){
        this.value=value;
    }
    public static  Result<Stock> Create(int value) throws IllegalAccessException {
        //valiation
        if(value<=0) return Result.Failed("Stock is invalid,cant be less or equals to 0");

        return Result.Ok( new Stock(value));
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
