package com.amr.service;

import com.amr.LaptopRebository;
import com.amr.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRebository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap) {
        return true;
    }
}
