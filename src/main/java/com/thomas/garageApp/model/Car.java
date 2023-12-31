package com.thomas.garageApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    }
    @Id
    private long id;
    private String model;
    private String brand;

    @Column(name= "released_year")
    private int year;
    private Color color;
    public Car() {

    }
    public Car(long id,String model, String brand, int yeah, Color color) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYeah(int yeah) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
