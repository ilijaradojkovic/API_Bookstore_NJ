package customer.value_object;

import common.Result;
import common.ValueObject;

import java.util.Objects;
import java.util.regex.Pattern;

public class Password  extends ValueObject<Password> {

    private final String value;
    private  Password(String value){
        this.value=value;
    }
    public static Result<Password> Create(String value){
        Pattern pattern=Pattern.compile("[a-z0-9]{5,}$",Pattern.CASE_INSENSITIVE);
        if(!pattern.matcher(value).matches())  return Result.Failed("Password nije u dobrom formatu");
        return Result.Ok(new Password(value));
    }

    @Override
    protected int hashCodeCore() {
        return value.hashCode();
    }

    @Override
    protected boolean equalsCore(Object obj) {
        return Objects.equals(value,obj);
    }
}
