package net.codeer.examplemodulefirst;

import net.codeer.examplemodulefirst.sayers.HelloSayer;

public final class HelloClass {
    public void sayHello() {
        delegateSayHello(new HelloSayer());
    }

    public void delegateSayHello(Sayer sayer) {
        sayer.say();
    }
}
