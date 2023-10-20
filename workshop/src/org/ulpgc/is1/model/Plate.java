package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        if(isValidPlate(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(isValidPlate(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public boolean isValidPlate(String number){
        if(number.matches("\\d{4} [A-Za-z]{3}")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return '\'' + number;
    }
}
