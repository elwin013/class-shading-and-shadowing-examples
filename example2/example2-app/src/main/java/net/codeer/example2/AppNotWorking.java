package net.codeer.example2;


import net.codeer.example2.pkg.HelloWorlder;
import net.codeer.example2.pkg.Serializer;

public class AppNotWorking {
    public static void main(String[] args) {
        var helloWorld = new HelloWorlder("Kamil", 2023);

        var serializer = new Serializer();
        System.out.println(serializer.serialize(helloWorld));

        var serializer2 = new net.codeer.example2.serializer.FancySerializer();
        System.out.println(serializer2.serialize(helloWorld));
    }

}
