package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.List;

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDateTime date;
    private String description;
    private int effort;
    private Vehicle vehicle;
    private List<Mechanic> mechanicsList;
    private List<Item> itemsList;
    private List<BreakdownTypes> breakdownTypesList;
    private Payment payment;
    private int debt = 0;

    public Repair(int id, String description, int effort, Vehicle vehicle,
                  List<Mechanic> mechanicsList, List<Item> itemsList, List<BreakdownTypes> breakdownTypesList) {
        this.id = id;
        this.date = LocalDateTime.now();
        this.description = description;
        this.effort = effort;
        this.itemsList = itemsList;
        this.mechanicsList = mechanicsList;
        this.vehicle = vehicle;
        this.payment = payment;
        this.breakdownTypesList = breakdownTypesList;
        this.getDebt(); //inicializa la deuda
    }

    //getters
    public int getId() {return id;}
    public LocalDateTime getDate() {return date;}
    public String getDescription() {return description;}
    public int getEffort() {return effort;}
    public Vehicle getVehicle() {return vehicle;}
    public List<Mechanic> getMechanicsList() {return mechanicsList;}
    public List<Item> getItemsList() {return itemsList;}
    public List<BreakdownTypes> getBreakdownTypesList() {return breakdownTypesList;}
    public Payment getPayment() {return payment;}

    //pago
    public void pay(int amount){
        payment = new Payment(amount);

    }

    //deuda
    private void getDebt(){
        for (int i = 0; i<itemsList.size();i++){
            debt += itemsList.get(i).getQuantity() * itemsList.get(i).getSparePart().getPrice();
        }
    }
    public int price(){return debt;}

    //añadir elementos
    public void addMechanic(Mechanic mechanic){
        if(mechanicsList.isEmpty()){
            mechanicsList.add(mechanic);
            return;
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
    public void addItem(Item item){
        if (itemsList.isEmpty()){
            itemsList.add(item);
            debt += item.getQuantity()*item.getSparePart().getPrice();
            return;
        }
        boolean b = false;
        for (int i =0; i<itemsList.size();i++){
            if (itemsList.get(i).equals(item)){
                b=true;
                break;
            }
        }
        if(!b){
            itemsList.add(item);
            debt += item.getQuantity()*item.getSparePart().getPrice();
        }
    }
    public void addBreakdownType(BreakdownTypes types){
        if(!(breakdownTypesList.contains(types))){
            breakdownTypesList.add(types);
        }
    }

    /* NO HACE FALTA: aunque se borre un vehiculo del repairManager, quedaria en el "historial" del mecanico y la pieza
    por lo que como tal, no se va a borrar elementos de una instancia de Repair
    //remober elementos
    public void removeMechanic(Mechanic mechanic){
        mechanicsList.remove(mechanic);
    }
    public void removeItem(Item item){
        itemsList.remove(item);
    }
    public void removeBreakDownType(BreakdownTypes types){
        breakdownTypesList.remove(types);
    }
     */

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", effort=" + effort +
                ", vehicle=" + vehicle +
                ", mechanicsList=" + mechanicsList +
                ", itemsList=" + itemsList +
                ", breakdownTypesList=" + breakdownTypesList +
                ", payment=" + payment +
                '}';
        //item tiene un atributo Repair. En el toString(),
        // solo llama el Repair.Id, para evitar problemas
    }
}
