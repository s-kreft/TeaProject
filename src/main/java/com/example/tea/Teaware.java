package com.example.tea;

public class Teaware extends Item {
    private Double volume;

    public Teaware() {

    }
    public Teaware(String name, Double volume, Double price) {
        this.name=name;
        this.price=price;
        this.volume=volume;
    }
}
