package com.thomas.garageApp.model;
public class Car {

    public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    }
    private long id;
    private String model;
    private String brand;
    private int yeah;
    private Color color;
    public Car() {

    }
    public Car(long id,String model, String brand, int yeah, Color color) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.yeah = yeah;
        this.color = color;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYeah() {
        return yeah;
    }

    public void setYeah(int yeah) {
        this.yeah = yeah;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
