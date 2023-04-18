package com.acme.demo.medical.care.domain.address;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String streetName;
    private String neighborhood;
    private String zipCode;
    private String addressNumber;
    private String complement;
    private String city;
    @Column(columnDefinition = "char")
    private String state;

}
