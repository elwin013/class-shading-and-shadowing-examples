package net.codeer.examplemodulefirst.sayers;

import net.codeer.examplemodulefirst.Sayer;

public class GoodnightSayer implements Sayer {
    @Override
    public void say() {
        System.out.println("Goodnight!");
    }
}
