package cupon.value_object;

import common.Result;
import common.ValueObject;

import java.util.GregorianCalendar;
import java.util.Objects;

public class StartDate extends ValueObject<StartDate> {
    private final GregorianCalendar value;


    public StartDate(GregorianCalendar value) {
        this.value = value;
    }

    public static Result<StartDate> Create(GregorianCalendar value) throws IllegalAccessException {
        if(value==null|| value.before(new GregorianCalendar())) return  Result.Failed("Datum is invalid");
        return Result.Ok(new StartDate(value));
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
