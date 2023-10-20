package org.ulpgc.is1.model;

public class Vehicle {
    private String make;
    private String model;
    private Plate plate;

    public Vehicle(String make, String model, Plate plate) {
        this.make = make;
        this.model = model;
        this.plate = plate;
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

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
