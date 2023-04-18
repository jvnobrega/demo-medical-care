package com.acme.demo.medical.care.domain;

import com.acme.demo.medical.care.commons.domain.error.ApplicationErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public enum DemoMedicalCareErrorCode implements ApplicationErrorCode {

    DOCTOR_NOT_FOUND("001", NOT_FOUND, "Doctor not Found"),
    PATIENT_NOT_FOUND("002", NOT_FOUND, "Patient not Found");


    @Getter
    private final String code;

    @Getter
    private final String message;

    @Getter
    private final HttpStatus status;

    DemoMedicalCareErrorCode(String code, HttpStatus status, String message) {
        this.code = getPrefixCode().concat(code);
        this.status = status;
        this.message = message;
    }

    @Override
    public String getPrefixCode() {
        return "DMC-";
    }
}
