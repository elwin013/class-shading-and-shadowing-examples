package net.codeer.example3;

import net.codeer.example3.pkg.HelloWorlder;
import net.codeer.example3.pkg.Serializer;

public class App {
    public static void main(String[] args) {
        var helloWorld = new HelloWorlder("Kamil", 2023);

        var serializer = new Serializer();
        System.out.println(serializer.serialize(helloWorld));
        System.out.println(serializer.getSerializerPackage());

//        Will that below work? :O
        var serializer2 = new net.codeer.example3module.serializer.FancySerializer();
        System.out.println(serializer2.serialize(helloWorld));
        System.out.println(serializer2.getSerializerPackage());

    }
}
