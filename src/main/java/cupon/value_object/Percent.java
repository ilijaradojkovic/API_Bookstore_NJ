package cupon.value_object;

import common.Result;

public class Percent {
    private final int value;

    private Percent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Result<Percent>  of(int value){
        if(value<=0 || value>=100) return Result.Failed("Percent is invalid (0-100)");
        return Result.Ok(new Percent(value));
    }
}
