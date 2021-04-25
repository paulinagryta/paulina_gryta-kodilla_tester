package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private int length;
    private int width;
    private String postmark;

    public Stamp(String name, int length, int width, String postmark){
        this.name = name;
        this.length = length;
        this.width = width;
        this.postmark = postmark;
    }
    public String getStringName(){
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getPostmark() {
        return postmark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return getLength() == stamp.getLength() && getWidth() == stamp.getWidth() && Objects.equals(name, stamp.name) && Objects.equals(getPostmark(), stamp.getPostmark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getLength(), getWidth(), getPostmark());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", postmark='" + postmark + '\'' +
                '}';
    }
}
