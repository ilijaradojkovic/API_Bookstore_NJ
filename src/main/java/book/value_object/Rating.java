package book.value_object;

import common.Result;
import common.ValueObject;

public class Rating  extends ValueObject<Rating> {

    private final int value;

    private static final int minRating =1;
    private static final  int maxRating=5;
    private Rating(int value){
        this.value=value;
    }
    public static Result<Rating> Create(int value)  {
        //valiation
        if(value<minRating || value>maxRating) return  Result.Failed("Rating is invalid,must be in range [1,5]");

        return Result.Ok(new Rating(value));
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
        return value==valueOther;
    }
}
