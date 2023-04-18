package com.acme.demo.medical.care.application.response;

import com.acme.demo.medical.care.domain.doctor.Doctor;
import com.acme.demo.medical.care.domain.doctor.MedicalSpecialty;

public record DoctorResponse(
        String uuid,
        String name,
        String crm,
        MedicalSpecialty specialty) {

    public DoctorResponse(Doctor doctor) {
        this(
                doctor.getUuid(),
                doctor.getName(),
                doctor.getCrm(),
                doctor.getMedicalSpecialty()
        );
    }

}
