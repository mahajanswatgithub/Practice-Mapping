package com.example.MappingPractice.Mapping.controller;

import com.example.MappingPractice.Mapping.model.Address;
import com.example.MappingPractice.Mapping.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //add address Info
    @PostMapping("address")
    public void addAddress(@RequestBody @Valid Address address)
    {
        addressService.addAddress(address);
    }

    //    get all addresses
    @GetMapping("address")
    public Iterable<Address> getAddress()
    {
        return addressService.getAddress();
    }

    //update address by landmark using addressId
    @PutMapping("address/{id}/{landmark}")
    public void updateAddressByAddressLandmark(@PathVariable String id,@PathVariable String landmark)
    {
        addressService.updateAddressByAddressLandmark(id,landmark);
    }

    //delete address using addressId
    @DeleteMapping("address/{id}")
    public void deleteAddressById(@PathVariable String id)
    {
        addressService.deleteAddressById(id);
    }
}
