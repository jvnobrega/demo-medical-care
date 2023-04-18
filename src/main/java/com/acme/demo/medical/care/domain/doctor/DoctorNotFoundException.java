package com.acme.demo.medical.care.domain.doctor;

import com.acme.demo.medical.care.commons.infra.ServiceException;

import static com.acme.demo.medical.care.domain.DemoMedicalCareErrorCode.DOCTOR_NOT_FOUND;

public class DoctorNotFoundException extends ServiceException {

    public DoctorNotFoundException() {
        super(DOCTOR_NOT_FOUND);
    }
}
