package com.amr;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop creating");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
