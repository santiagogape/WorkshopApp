package org.ulpgc.is1.model;

import java.util.Objects;

public class Item {
    private int quantity;
    private final Repair repair;
    private SparePart sparePart;
    public Item(int quantity, Repair repair, SparePart sparepart) {
        this.quantity = quantity;
        this.repair = repair;
        this.sparePart = sparepart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Repair getRepair() {
        return repair;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", repair ID=" + repair.getId() +
                ", sparePart= " + sparePart +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity &&
                Objects.equals(repair, item.repair) &&
                Objects.equals(sparePart, item.sparePart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, repair, sparePart);
    }
}
