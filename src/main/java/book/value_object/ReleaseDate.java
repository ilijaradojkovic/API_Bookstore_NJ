package book.value_object;

import common.Result;
import common.ValueObject;

import java.util.GregorianCalendar;
import java.util.Objects;

public class ReleaseDate  extends ValueObject<ReleaseDate> {

    private final GregorianCalendar value;

    private ReleaseDate(GregorianCalendar value) {
        this.value = value;
    }
    public static Result<ReleaseDate> Create(GregorianCalendar value)  {
        if(value==null|| value.after(new GregorianCalendar())) Result.Failed("Datum is invalid");
    return Result.Ok(new ReleaseDate(value));
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
