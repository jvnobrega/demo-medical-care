package com.acme.demo.medical.care.application.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressRequest(
        @NotBlank
        String streetName,
        @NotBlank
        String neighborhood,
        @NotBlank
        @Pattern(regexp = "\\d{5}")
        String zipCode,
        @NotBlank
        String city,
        @NotBlank
        String state,
        String complement,
        String addressNumber) {
}
