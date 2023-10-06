package com.fraz.dsa;

import com.fraz.dsa.InventoryManagementSystem;
import com.fraz.dsa.model.Product;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products to the inventory
        ims.addProduct("Laptop", 899.99);
        ims.addProduct("Smartphone", 499.99);
        ims.addProduct("Tablet", 299.99);

        // Removing a product
        ims.removeProduct(1);

        // Searching for a product
        Product foundProduct = ims.searchProduct(2);
        if (foundProduct != null) {
            System.out.println("Found Product: " + foundProduct.getName() + " - Price: $" + foundProduct.getPrice());
        }
    }
}