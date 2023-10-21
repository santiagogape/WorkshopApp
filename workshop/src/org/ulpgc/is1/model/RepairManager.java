package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {
    private final List<SparePart> sparePartsList;
    private final List<Mechanic> mechanicsList;
    private final List<Vehicle> vehiclesList;

    public RepairManager() {
        this.sparePartsList = new ArrayList<>();
        this.mechanicsList = new ArrayList<>();
        this.vehiclesList = new ArrayList<>();
    }

    //getters de listas
    public List<SparePart> getSparePartsList() {
        return sparePartsList;
    }
    public List<Mechanic> getMechanicsList() {
        return mechanicsList;
    }
    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    //getters de elementos
    public SparePart getSparePart(int i){
        return sparePartsList.get(i);
    }
    public Vehicle getVehicle(int i){
        return vehiclesList.get(i);
    }
    public Mechanic getMechanic(int i){
        return mechanicsList.get(i);
    }

    //creacion de elementos
    public void addSparePart(String name, int price){
        SparePart part = new SparePart( name, price);
        if (sparePartsList.isEmpty()){
            sparePartsList.add(part);
            return;
        }
        boolean b = false;
        for(int i=0;i<sparePartsList.size();i++){
            if(sparePartsList.get(i).equals(part)){
                b = true;
                break;
            }
        }
        if (!b){
            sparePartsList.add(part);
        }
    }
    public void addVehicle(String make, String model, Plate plate, Customer owner){
        Vehicle vehicle = new Vehicle(make, model, plate, owner);
        if(vehiclesList.isEmpty()){
            vehiclesList.add(vehicle);
        }
        boolean b =false;
        for(int i =0; i<vehiclesList.size();i++){
            if (vehiclesList.get(i).equals(vehicle)){
                b=true;
                break;
            }
        }
        if (!b){
            vehiclesList.add(vehicle);
        }
    }
    public void addMechanic(String name, String surname){
        Mechanic mechanic = new Mechanic(name, surname);
        if (mechanicsList.isEmpty()){
            mechanicsList.add(mechanic);
        }
        boolean b = false;
        for (int i =0; i<mechanicsList.size();i++){
            if (mechanicsList.get(i).equals(mechanic)){
                b=true;
                break;
            }
        }
        if(!b){
            mechanicsList.add(mechanic);
        }
    }

    //borrado de elementos
    public void removeSparePart(SparePart part){
        sparePartsList.remove(part);
    }
    public void removeVehicle(Vehicle vehicle){
        vehiclesList.remove(vehicle);
    }
    public void removeMechanic(Mechanic mechanic){
        mechanicsList.remove(mechanic);
    }

    //reparacion
    //TODO repair()

}
