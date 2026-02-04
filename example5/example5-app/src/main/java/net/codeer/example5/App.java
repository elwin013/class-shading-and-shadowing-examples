package net.codeer.example5;

import net.codeer.example5module.serializer.FancySerializer;
import net.codeer.example5module.serializer.NormalSerializer;

public class App {
    public record HelloWorlder(String name, Integer year) {}

    public static void main(String[] args) {
        var helloWorld = new HelloWorlder("Kamil", 2023);

        var serializer = new NormalSerializer(); // from example5-module
        System.out.println(serializer.serialize(helloWorld));
        System.out.println(serializer.getSerializerPackage());

        var serializer2 = new FancySerializer(); // from example5-secondmodule
        System.out.println(serializer2.serialize(helloWorld));
        System.out.println(serializer2.getSerializerPackage());
    }
}
