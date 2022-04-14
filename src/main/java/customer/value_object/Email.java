package customer.value_object;

import common.Result;
import common.ValueObject;

import java.util.Objects;
import java.util.regex.Pattern;

public class Email extends ValueObject<Email> {

    private final String value;
    private  Email(String value){
        this.value=value;
    }
    public static Result<Email> Create(String value){
        Pattern pattern=Pattern.compile("[a-z0-9]+@gmail.com",Pattern.CASE_INSENSITIVE);
        if(!pattern.matcher(value).matches())  return Result.Failed("Email nije u dobrom formatu");
        return Result.Ok(new Email(value));
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
