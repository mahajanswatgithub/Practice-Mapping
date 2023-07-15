package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Address;
import com.example.MappingPractice.Mapping.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;


    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public Iterable<Address> getAddress() {
        return addressRepo.findAll();
    }

    public void updateAddressByAddressLandmark(String id, String landmark) {
        addressRepo.updateAddressByAddressLandmark(id,landmark);
    }

    public void deleteAddressById(String id) {
        addressRepo.deleteById(id);
    }
}
