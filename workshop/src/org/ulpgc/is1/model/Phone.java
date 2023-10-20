package org.ulpgc.is1.model;
import java.util.Objects;

public class Phone {
    private String number;
    public Phone(String number){
        if (isValid(number)){
            this.number = number;
        } else {
            System.out.println("Phone number is not valid, the number will be XXXX");
            this.number = "XXXX";
        }
    }

    private boolean isValid(String number){
        return number.length() == 9;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isValid(number)){
            this.number = number;
        } else {
            System.out.println("Phone number is not valid, the number will be XXXX");
            this.number = "XXXX";
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(number, phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
