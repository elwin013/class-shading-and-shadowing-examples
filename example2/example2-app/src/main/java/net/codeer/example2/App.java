package net.codeer.example2;


import net.codeer.example2.pkg.HelloWorlder;
import net.codeer.example2.pkg.Serializer;

public class App {
    public static void main(String[] args) {
        var helloWorld = new HelloWorlder("Kamil", 2023);

        var serializer = new Serializer();
        System.out.println(serializer.serialize(helloWorld));

//        What happen when we uncomment below?
//        var serializer2 = new net.codeer.example2.serializer.FancySerializer();
//        System.out.println(serializer2.serialize(helloWorld));
    }

}
