package com.amr;


import com.amr.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean("com2", Desktop.class);
        Desktop dt = context.getBean(Desktop.class);

        Desktop dt2 = context.getBean(Desktop.class);
        dt.compile();

    }
}
