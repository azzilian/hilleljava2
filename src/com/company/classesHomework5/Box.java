package com.company.classesHomework5;

public class Box {
    private String name;
    private int length;
    private int width;
    private int height;
    private int volume;

    //конструктор

    public Box(String name, int length, int width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = volume(length,width,height);

    }

    public int volume (int length, int width, int height){
        return volume = length * width * height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return volume;
    }
}