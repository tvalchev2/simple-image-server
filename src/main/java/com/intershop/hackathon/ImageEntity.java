package com.intershop.hackathon;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ImageEntity extends PanacheEntity {
    public String name;
    public String size;
    public byte[] data;
}
