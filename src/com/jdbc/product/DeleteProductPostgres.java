package com.jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteProductPostgres {

     static  String URL = "jdbc:postgresql://localhost:5433/training";
     static  String USER = "postgres";
     static  String PASSWORD = "tiger";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID to delete: ");
        int productId = sc.nextInt();

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // 1️⃣ Check if product exists
            String productCheck = "SELECT product_id FROM products WHERE product_id = ?";
            PreparedStatement productStmt = con.prepareStatement(productCheck);
            productStmt.setInt(1, productId);
            ResultSet productRs = productStmt.executeQuery();

            if (!productRs.next()) {
                System.out.println("Product not found");
                return;
            }

            // 2️⃣ Check for associated orders
            String checkOrders = "SELECT COUNT(*) FROM orders WHERE product_id = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkOrders);
            checkStmt.setInt(1, productId);

            ResultSet rs = checkStmt.executeQuery();
            rs.next();
            int orderCount = rs.getInt(1);

            if (orderCount > 0) {
                System.out.println("Cannot delete product with existing orders");
            } else {

                // 3️⃣ Delete product
                String deleteQuery = "DELETE FROM products WHERE product_id = ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                deleteStmt.setInt(1, productId);

                int rows = deleteStmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("Product deleted successfully");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

