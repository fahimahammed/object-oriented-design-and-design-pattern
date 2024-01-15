package Problem2;

import java.time.LocalDate;

public class Sale {
    private Pet pet;
    private Customer customer;
    private LocalDate date;
    private double totalPrice;

    public Sale(Pet pet, Customer customer, double totalPrice) {
        this.pet = pet;
        this.customer = customer;
        this.date = LocalDate.now();
        this.totalPrice = totalPrice;
    }

    // Getters for sale information
    public Pet getPet() {
        return pet;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
