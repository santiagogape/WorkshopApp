package org.ulpgc.is1.model;

import java.util.Objects;

public class Plate {
    private String number;

    public Plate(String number) {
        if(isValid(number)) {
            this.number = number;
        } else {
            System.out.println("El numero no es válido.");
            this.number = "XXXX";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(isValid(number)) {
            this.number = number;
        } else {
            System.out.println("El numero no es válido.");
            this.number = "XXXX";
        }
    }

    public boolean isValid(String number){
        if(number.matches("\\d{4} [A-Za-z]{3}")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Plate plate = (Plate) obj;
        return Objects.equals(number, plate.number);
    }
}
