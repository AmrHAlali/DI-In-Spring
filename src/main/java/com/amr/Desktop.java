package com.amr;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component("comp1")
@Scope("prototype")
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop creating");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
