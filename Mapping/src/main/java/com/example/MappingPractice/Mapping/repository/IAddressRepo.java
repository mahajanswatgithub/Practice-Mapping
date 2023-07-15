package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,String> {

    @Transactional
    @Modifying
    @Query(value = "update Address set Address_Landmark = :landmark where Address_Id = :id",nativeQuery = true)
    void updateAddressByAddressLandmark(String id, String landmark);
}
