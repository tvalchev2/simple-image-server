package com.intershop.hackathon;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("image")
public class ImageResource {

    @GET
    @Produces("image/png")
    @Path("{name}/{size}")
    public byte[] getImage(final String name, final String size) {
        System.out.println("Name: "+name+", size: "+size);

        Optional<ImageEntity> opt = ImageEntity.find("name = ?1 and size = ?2", name, size).firstResultOptional();
        if (opt.isPresent()) {
            System.out.println("Found something");
            return opt.get().data;
        }
        System.out.println("Found nothing :(");
        return new byte[0];
    }
}
