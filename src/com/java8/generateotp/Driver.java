package com.java8.generateotp;

import java.util.Random;
import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) {

        Random random = new Random();

        Supplier<String> otp = () -> 
                String.format("%06d", random.nextInt(1_000_000));

        for (int i = 0; i < 5; i++) {
            System.out.println(otp.get());
        }
    }
}

