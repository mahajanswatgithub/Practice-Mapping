package com.example.MappingPractice.Mapping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @NotEmpty
    private String addressId;

    private String addressLandmark;


    @Column(unique = true)
    private String addressZipcode;

    private String addressDistrict;
    private String addressState;
    private String addressCountry;

}
