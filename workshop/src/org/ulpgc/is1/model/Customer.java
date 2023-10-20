package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Phone phone;

    private List<Vehicle> vehiclesList;

    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
        this.vehiclesList = new ArrayList<>();
    }


    //getters
    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        if (!(this.phone.getNumber().equals(phone))){
            this.phone = new Phone(phone);
        }
    }

    public void addVehicle(Vehicle vehicle){
        for (int i=0; i<this.vehiclesList.size();i++){
            if(this.vehiclesList.get(i).equals(vehicle)){
                break;
            }
            if(i==this.vehiclesList.size()-1){
                this.vehiclesList.add(vehicle);
            }
        }
    }

    public void removeVehicle(Vehicle vehicle){
        for(Vehicle v: this.vehiclesList){
            if(v.equals(vehicle)){
                this.vehiclesList.remove(vehicle);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
