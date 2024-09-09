package net.codeer.example4;

import com.google.gson.Gson;

import java.sql.Date;
import java.time.Instant;

public class App {
    public static void main(String[] args) {
        System.out.println("net.codeer.example4.App class loader: " + App.class.getClassLoader());
        System.out.println("com.google.gson.GSON class class: " + Gson.class.getClassLoader());
        System.out.println("java.sql.Date loader: " + Date.class.getClassLoader());
        System.out.println("java.time.Instant class loader: " + Instant.class.getClassLoader());

    }
}
