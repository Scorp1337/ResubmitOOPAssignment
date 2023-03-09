package org.example;

public class Novel extends Book{

    private String type;

    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;

    }

    public String getType() {
        return type;
    }
}
