package com.intershop.hackathon;

/**
 * This class contains the content necessary to get an image.
 * Actually, that is name and size.
 */
public class ImageDefinition {
    public String name;
    public String size;

    @Override
    public String toString() {
        return String.format("Name: %s, Size: %s", name, size);
    }
}
