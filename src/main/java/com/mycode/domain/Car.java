/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycode.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

/**
 *
 * @author ahossein
 */
public class Car {

    @Id
    private String vin;
    private String make;
    private String model;
    private short year;
    private int mileage;
    private String color;
    private String trim;
    @Transient
    private String type; //Diesel, Electric, Gas

    public Car() {

    }

    public Car(String vin, String make, String model, short year, int mileage, String color, String trim) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.trim = trim;
//        this.type = sentData.type;
    }

    public Car(Car sentData) {
        this.vin = sentData.vin;
        this.make = sentData.make;
        this.model = sentData.model;
        this.year = sentData.year;
        this.mileage = sentData.mileage;
        this.color = sentData.color;
        this.trim = sentData.trim;
        this.type = sentData.type;
    }

    public String[] getMaintenanceTasksList() {
        return new String[]{"Oil Change", "Tire Rotation"};
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equalsAnyAttributes(Car car) {
        if (this.vin.equalsIgnoreCase(car.getVin())
                || this.make.equalsIgnoreCase(car.getMake())
                || this.model.equalsIgnoreCase(car.getModel())
                || this.year == car.getYear()
                || this.mileage == car.getMileage()
                || this.trim.equalsIgnoreCase(car.getTrim())
                || this.color.equalsIgnoreCase(car.getColor())) {
            return true;
        }
        return false;
    }

}
