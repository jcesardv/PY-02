package org.example.solid.scenario.sr;

import java.util.List;

public class Invoice {
    private List<Item> items;

    public Invoice(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal() {
        return items.stream()
                .mapToDouble(i -> i.getPrice() * i.getQuantity())
                .sum();
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database ...");
    }

    public void printInvoice() {
        System.out.println("Printing invoice ...");
    }
}

