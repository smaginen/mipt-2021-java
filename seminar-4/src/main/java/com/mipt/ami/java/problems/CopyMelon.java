package com.mipt.ami.java.problems;

public class CopyMelon {
    private String name;
    private String type;

    public CopyMelon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CopyMelon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
