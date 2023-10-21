package org.ulpgc.is1.control;


import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RepairManager rp = new RepairManager();
        init(rp);
        Mechanic mechanic1 = rp.getMechanic(0);
        Vehicle vehicle2 = rp.getVehicle(1);
        System.out.println(mechanic1);
        System.out.println(vehicle2);
        rp.repair("reparacion en el vehicle2 de dos items por mechani1 del tipo Mechanical",
                4, vehicle2, Arrays.asList(mechanic1), rp.getSparePartsList(),
                Arrays.asList(1,1), Arrays.asList(BreakdownTypes.mechanical));
        Repair repairVehicle2 =vehicle2.getRepair(0);
        System.out.println(repairVehicle2.price());
        repairVehicle2.pay(1039);
        rp.removeVehicle(vehicle2);
        System.out.println(rp.getVehicleCount());
        System.out.println(repairVehicle2);
    }

    public static void init(RepairManager rp){
        rp.addMechanic("shuli", "sharama");
        rp.addMechanic("shatiaglo", "gakalameshita");
        rp.addVehicle("made in japan", "apple16", new Plate("1234 ABC"),
                new Customer("kata",new Phone("640758329")));
        rp.addVehicle("made in santa catalina", "chimi23", new Plate("3214 ABC"),
                new Customer("kratos",new Phone("964836029")));
        rp.addSparePart("tornillo", 40);    //es que es de titanio
        rp.addSparePart("motor", 999);      //una ganga
    }
}