package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.model.Laptop;
import com.example.MappingPractice.Mapping.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public void addLaptopInfo(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public void updateLaptopByLaptopPrice(String id, Integer price) {
        laptopRepo.updateLaptopByLaptopPrice(id,price);
    }

    public void deleteLaptopById(String id) {
        laptopRepo.deleteById(id);
    }

    public Iterable<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }
}
