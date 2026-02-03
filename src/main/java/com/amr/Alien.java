package com.amr;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer comp;

    public Alien() {
    }

    public int getAge() {
        System.out.println("Setter Called");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return comp;
    }

    public void setComputer(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        System.out.println("Coding");
        comp.compile();
    }
}
