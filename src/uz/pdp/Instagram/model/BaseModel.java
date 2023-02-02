package uz.pdp.Instagram.model;

import java.util.UUID;

public abstract class BaseModel {
   private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
