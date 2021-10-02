package com.mipt.ami.java.task.decorator;

public class Cake {

    private final String decorations;

    public Cake(String decorations) {
        this.decorations = decorations;
    }

    public Cake decorate(String decoration) {
        return new Cake(getDecorations() + decoration);
    }

    public String getDecorations() {
        return decorations;
    }
}
