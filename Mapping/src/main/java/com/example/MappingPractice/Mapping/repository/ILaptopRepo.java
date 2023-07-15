package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Laptop;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,String>{

    @Transactional
    @Modifying
    @Query(value = "update Laptops set Laptop_Price = :price where Laptop_Id = :id",nativeQuery = true)
    void updateLaptopByLaptopPrice(String id, Integer price);
}
