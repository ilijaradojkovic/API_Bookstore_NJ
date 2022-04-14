package cupon.value_object;

import common.Result;
import common.ValueObject;

import java.util.GregorianCalendar;
import java.util.Objects;

public class EndDate extends ValueObject<EndDate> {
    private final GregorianCalendar value;


    public EndDate(GregorianCalendar value) {
        this.value = value;
    }

    public static Result<EndDate> Create(GregorianCalendar value, StartDate startDate) {
        if(value==null|| value.before(startDate)) return  Result.Failed("Datum is invalid");
        return Result.Ok(new EndDate(value));
    }

    @Override
    protected int hashCodeCore() {
        return value.hashCode();
    }

    @Override
    protected boolean equalsCore(Object obj) {
        return Objects.equals(obj,value);
    }
}
