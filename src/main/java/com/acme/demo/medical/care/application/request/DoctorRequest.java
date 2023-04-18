package com.acme.demo.medical.care.application.request;

import com.acme.demo.medical.care.domain.doctor.MedicalSpecialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorRequest(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telephone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        MedicalSpecialty specialty,
        @NotNull @Valid AddressRequest address) {
}
