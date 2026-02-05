package com.bank.account;

public class Customer {

    private String customerId;
    private String customerName;
    private String email;

    public Customer(String customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }
}
