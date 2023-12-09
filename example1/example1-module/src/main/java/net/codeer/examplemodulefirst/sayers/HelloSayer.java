package net.codeer.examplemodulefirst.sayers;

import net.codeer.examplemodulefirst.Sayer;

public class HelloSayer implements Sayer {
    @Override
    public void say() {
        System.out.println("HelloSayer says hello!");
    }
}
