package com.intershop.hackathon;

public class ImageDefinitionFactory {

    public static ImageDefinition create(final ImageEntity source) {
        ImageDefinition result = new ImageDefinition();
        result.name = source.name;
        result.size = source.size;
        return result;
    }
}
