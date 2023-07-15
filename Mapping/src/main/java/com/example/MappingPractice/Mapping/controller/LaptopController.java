package com.example.MappingPractice.Mapping.controller;

import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.model.Laptop;
import com.example.MappingPractice.Mapping.service.LaptopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    //add laptop info
    @PostMapping("laptop")
    public void addLaptopInfo(@RequestBody @Valid Laptop laptop)
    {
        laptopService.addLaptopInfo(laptop);
    }

    //get all laptops
    @GetMapping("laptops")
    public Iterable<Laptop> getAllLaptop()
    {
        return laptopService.getAllLaptop();
    }

    //update Laptop by price using LaptopId
    @PutMapping("Laptop/{id}/{price}")
    public void updateLaptopByLaptopPrice(@PathVariable String id, @PathVariable Integer price)
    {
        laptopService.updateLaptopByLaptopPrice(id,price);
    }

    //delete Laptop using LaptopId
    @DeleteMapping("Laptop/{id}")
    public void deleteLaptopById(@PathVariable String id)
    {
        laptopService.deleteLaptopById(id);
    }
}
