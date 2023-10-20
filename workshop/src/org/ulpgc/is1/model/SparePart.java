package org.ulpgc.is1.model;

import java.util.Objects;

public class SparePart {
    private String name;
    private int price;

    public SparePart(String name, int price) {
        this.name = name;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SparePart sparePart = (SparePart) o;
        return price == sparePart.price && Objects.equals(name, sparePart.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "SparePart{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
