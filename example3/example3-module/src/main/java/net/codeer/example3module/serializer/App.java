package net.codeer.example3module.serializer;


public class App {
    public static void main(String[] args) {
        var helloWorld = new HelloWorlder("Kamil", 2023);

//        What happen when we uncomment below?
        var serializer2 = new FancySerializer();
        System.out.println(serializer2.serialize(helloWorld));
        System.out.println(serializer2.getSerializerPackage());

    }

    public record HelloWorlder(String name, Integer year) {}
}
