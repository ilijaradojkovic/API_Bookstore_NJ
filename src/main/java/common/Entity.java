package common;

import java.util.Objects;
import java.util.UUID;

public abstract  class Entity {

    protected UUID Id;

    protected void setId(UUID id) {
        Id = id;
    }

    public UUID getId() {
        return Id;
    }


    @Override
    public boolean equals(Object obj) {

            var other = (Entity)obj;

            if (obj==null)
                return false;

            if (obj==this)
                return true;


            if (Id==null || other.Id == null)
                return false;

            return Id.compareTo(other.getId())==0;

    }

    @Override
    public int hashCode() {
        return Id.hashCode();
    }








}
