package com.amr;

import com.amr.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRebository {
    public void save(Laptop lap) {
        System.out.println("Saved in DB");
    }
}
