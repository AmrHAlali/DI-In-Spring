package com.amr.config;

import com.amr.Alien;
import com.amr.Computer;
import com.amr.Desktop;
import com.amr.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    public Alien alien(Computer com) { -> this line is only when there is one computer or when you used @Primary to the bean you need
    @Bean
    public Alien alien(@Qualifier("laptop") Computer com) { // this line if there is more than one computer
        Alien alien = new Alien();
        alien.setAge(25);
        alien.setComputer(com);

        return alien;
    }

    //    @Bean(name = {"com2", "disktop1", "beast"})
    @Bean
//    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }
}
