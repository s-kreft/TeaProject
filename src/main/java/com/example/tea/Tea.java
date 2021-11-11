package com.example.tea;

public class Tea extends Item {
    private TeaType teaType;
    private String region;

    public Tea() {

    }
    public Tea(String name, TeaType teaType, String region, double price) {
        this.name=name;
        this.teaType=teaType;
        this.price=price;
        this.region=region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", teaType=" + teaType +
                ", price=" + price +
                ", region='" + region + '\'' +
                '}';
    }
}
