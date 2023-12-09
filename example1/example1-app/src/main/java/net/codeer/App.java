package net.codeer;

public class App {
    public static void main(String[] args) {
        // Say something with our class from our module!
        new HelloClass().sayHello();

        // And say something from second module!
        new net.codeer.examplemodulefirst.HelloClass().sayHello();
    }
}
