package org.example.solid.solution.sr;

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

    public List<Item> getItems() {
        return items;
    }
}
