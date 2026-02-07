package com.amr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.amr")
public class Config {
////    public Alien alien(Computer com) { -> this line is only when there is one computer or when you used @Primary to the bean you need
//    @Bean
//    public Alien alien(@Qualifier("laptop") Computer com) { // this line if there is more than one computer
//        Alien alien = new Alien();
//        alien.setAge(25);
//        alien.setComputer(com);
//
//        return alien;
//    }
//
//    //    @Bean(name = {"com2", "disktop1", "beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}