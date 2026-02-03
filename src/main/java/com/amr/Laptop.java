package com.amr;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // -> to make it the first choice if there is more than on computer
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
