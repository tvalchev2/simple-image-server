package com.intershop.hackathon;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@Path("upload")
public class UploadResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String upload(FileUploadForm form) {

        ImageEntity entity = new ImageEntity();
        try {
            entity.data = form.image.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
            return "An error happened! Please contact your administrator!";
        }
        entity.name = form.name;
        entity.size = form.size;
        entity.persistAndFlush();

        return String.format("Image %s is uploaded in size %s!", entity.name, entity.size);
    }
}
