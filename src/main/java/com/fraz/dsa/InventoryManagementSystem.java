package com.fraz.dsa;

import com.fraz.dsa.model.Product;

import java.util.LinkedList;

public class InventoryManagementSystem {
    private static final int MAX_PRODUCTS = 1000; // Maximum number of products

    private final Product[] products; // Array to store product data
    private final LinkedList<Integer> availableIDs; // Linked list to store available product IDs

    // Constructor
    public InventoryManagementSystem() {
        products = new Product[MAX_PRODUCTS];
        availableIDs = new LinkedList<>();

        // Initialize the list of available IDs
        for (int i = 0; i < MAX_PRODUCTS; i++) {
            availableIDs.add(i);
        }
    }

    // Function to add a new product to the inventory
    public void addProduct(String name, double price) {
        if (availableIDs.isEmpty()) {
            System.out.println("Inventory is full. Cannot add more products.");
            return;
        }

        int id = availableIDs.removeFirst();
        products[id] = new Product(id, name, price);
        System.out.println("Product added to inventory: " + name);
    }

    // Function to remove a product from the inventory
    public void removeProduct(int id) {
        if (id < 0 || id >= products.length || products[id] == null) {
            System.out.println("Product with ID " + id + " not found in the inventory.");
            return;
        }

        Product removedProduct = products[id];
        products[id] = null;
        availableIDs.add(id);
        System.out.println("Product removed from inventory: " + removedProduct.getName());
    }

    // Function to search for a product by ID
    public Product searchProduct(int id) {
        if (id < 0 || id >= products.length || products[id] == null) {
            System.out.println("Product with ID " + id + " not found in the inventory.");
            return null;
        }

        return products[id];
    }
}