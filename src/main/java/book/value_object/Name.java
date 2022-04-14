package book.value_object;

import common.Result;
import common.ValueObject;

import java.util.Objects;

public class Name  extends ValueObject<Name> {
    private  final String name;
    private Name(String name){
        this.name=name;
    }

    private static final int maxLength = 100;
    private static final int minLength = 4;

    public static Result<Name> Create(String name) {
        //validation
       if(name == null || name.length() > maxLength || name.length() < minLength) return Result.Failed("Name is not valid");
        return Result.Ok(new Name(name));
    }

    public String getName() {
        return name;
    }

    @Override
    protected int hashCodeCore() {
        return name.hashCode();
    }

    @Override
    protected boolean equalsCore(Object obj) {
       String valueOther=obj.toString();
       return Objects.equals(valueOther,name);
    }
}
