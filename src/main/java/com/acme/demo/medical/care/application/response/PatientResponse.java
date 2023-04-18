package com.acme.demo.medical.care.application.response;

import com.acme.demo.medical.care.domain.patient.Patient;

public record PatientResponse(
        String uuid,
        String name,
        String email,
        String document) {

    public PatientResponse(Patient patient) {
        this(
                patient.getUuid(),
                patient.getName(),
                patient.getEmail(),
                patient.getDocument()
        );
    }

}
