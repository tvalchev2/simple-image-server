package com.intershop.hackathon;

import jakarta.ws.rs.FormParam;
import org.jboss.resteasy.reactive.PartType;

import java.io.InputStream;

public class FileUploadForm {
    @FormParam("image")
    @PartType("application/octet-stream")
    public InputStream image;

    @FormParam("name")
    @PartType("text/plain")
    public String name;

    @FormParam("size")
    @PartType("text/plain")
    public String size;
}
