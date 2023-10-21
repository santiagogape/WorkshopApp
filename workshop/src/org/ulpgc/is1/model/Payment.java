package org.ulpgc.is1.model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Payment {

    private LocalDateTime date;
    private int amount;

    public Payment(int amount) {
        this.date = LocalDateTime.now();
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date=" + date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return amount == payment.amount && Objects.equals(date, payment.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount);
    }
}
