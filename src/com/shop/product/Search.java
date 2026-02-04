package com.shop.product;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Shop shop1 = new Shop();
        String[] string1 = { "coffee", "tea", "lemon tea" };
        shop1.setName("cafe");
        shop1.setProducts(string1);

        Shop shop2 = new Shop();
        String[] string2 = { "pizza", "burger","black tea" };
        shop2.setName("snacks");
        shop2.setProducts(string2);

        System.out.println("Enter product to search:");
        String string3 = s.nextLine();

        String[][] allProducts = { shop1.getProducts(), shop2.getProducts() };

        boolean temp = false;

        for (int i = 0; i < allProducts.length; i++) {
            for (int j = 0; j < allProducts[i].length; j++) {

                if ( allProducts[i][j].equalsIgnoreCase(string3)
                        || allProducts[i][j].toLowerCase().contains(string3.toLowerCase())) {
                	String shop="";
                	
                	if(i==0)
                		shop=shop1.getName();
                	else
                		shop=shop2.getName();
                		
                    System.out.println(
                        allProducts[i][j] + " available in this shop: "+shop);
                    temp = true;
                }
            }
        }

        if (!temp) {
            System.out.println(string3 + " not found in any shop");
        }

        s.close();
    }
}
