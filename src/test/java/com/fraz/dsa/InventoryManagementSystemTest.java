package com.fraz.dsa;

import com.fraz.dsa.model.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryManagementSystemTest {

    private final InventoryManagementSystem ims = new InventoryManagementSystem();

    // Automated test for adding a product to the inventory
    @Test
    public void addProduct() {
        String productName = "Laptop";
        double productPrice = 899.99;
        ims.addProduct(productName, productPrice);
        // assert added product
        Product foundProduct = ims.searchProduct(0);
        assertEquals(foundProduct.getName(), productName);
        assertEquals(foundProduct.getPrice(), productPrice, 0.0);
    }

    // Automated test for removing a product from the inventory
    @Test
    public void removeProduct() {
        String productName = "Laptop";
        double productPrice = 899.99;
        ims.addProduct(productName, productPrice);
        // assert added product
        Product foundProduct = ims.searchProduct(0);
        assertEquals(foundProduct.getName(), productName);
        assertEquals(foundProduct.getPrice(), productPrice, 0.0);
        // remove product
        ims.removeProduct(0);
        // assert removed product
        foundProduct = ims.searchProduct(0);
        assertNull(foundProduct);
    }

    // Automated test for searching for a product in the inventory
    @Test
    public void searchProduct() {
        String productName = "Laptop";
        double productPrice = 899.99;
        ims.addProduct(productName, productPrice);

        Product foundProduct = ims.searchProduct(0);
        assertEquals(foundProduct.getName(), productName);
        assertEquals(foundProduct.getPrice(), productPrice, 0.0);
    }
}