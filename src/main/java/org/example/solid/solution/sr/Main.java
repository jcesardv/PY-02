package org.example.solid.solution.sr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(Arrays.asList(
                new Item(20.0, 1),
                new Item(15.0, 1)
        ));

        System.out.printf("Total: $%s%n", invoice.calculateTotal());

        new InvoicePrinter().print(invoice);
        new InvoiceRepository().save(invoice);
    }
}
