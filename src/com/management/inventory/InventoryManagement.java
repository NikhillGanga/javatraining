package com.management.inventory;

import java.util.Random;

class Inventory {

    private int stock = 10;   // initial stock

    // synchronized method to avoid race condition
    public synchronized void purchase(String customerName, int quantity) {

        System.out.println(customerName + " is trying to buy " + quantity + " unit(s)");

        if (stock >= quantity) {
            stock -= quantity;
            System.out.println("Purchase successful for " + customerName +
                    ". Remaining stock: " + stock);
        } else {
            System.out.println("Purchase failed for " + customerName +
                    ". Not enough stock. Remaining stock: " + stock);
        }

        System.out.println("-----------------------------------");
    }

    public int getStock() {
        return stock;
    }
}

class Customer extends Thread {

    private Inventory inventory;
    private String customerName;

    public Customer(Inventory inventory, String customerName) {
        this.inventory = inventory;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        Random random = new Random();
        int quantity = random.nextInt(4) + 1;  // random between 1 and 4
        inventory.purchase(customerName, quantity);
    }
}

public class InventoryManagement {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // create 5 customers
        Customer c1 = new Customer(inventory, "Customer-1");
        Customer c2 = new Customer(inventory, "Customer-2");
        Customer c3 = new Customer(inventory, "Customer-3");
        Customer c4 = new Customer(inventory, "Customer-4");
        Customer c5 = new Customer(inventory, "Customer-5");

        // start threads
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        // wait for all threads to finish
        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Stock Remaining: " + inventory.getStock());
    }
}

