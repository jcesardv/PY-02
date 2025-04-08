package org.example.solid;

import java.util.List;


// -> Invoice
public class SingleResponsibilityScenario {
    private List<Item> items;

    public SingleResponsibilityScenario(List<Item> items) {
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

