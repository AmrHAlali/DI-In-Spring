package com.amr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("21")
    private int age;
    @Autowired() // this is field injection
    @Qualifier("desktop") // -> to choose between more than one component class
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

//    @Autowired // setter injection
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
