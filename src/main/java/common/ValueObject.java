package common;

public abstract class ValueObject<T extends ValueObject> {
    @Override
    public int hashCode() {
        return hashCodeCore();
    }

    protected abstract int hashCodeCore();

    @Override
    public boolean equals(Object obj) {
       if(obj == null) return false;


       return equalsCore(obj);
    }

    protected abstract boolean equalsCore(Object obj);
    
}
