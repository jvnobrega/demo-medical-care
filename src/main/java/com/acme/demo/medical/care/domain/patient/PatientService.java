package com.acme.demo.medical.care.domain.patient;

import com.acme.demo.medical.care.application.request.PatientRequest;
import com.acme.demo.medical.care.application.response.PatientResponse;
import com.acme.demo.medical.care.domain.address.Address;
import com.acme.demo.medical.care.domain.doctor.DoctorNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientResponse getDoctorByUuid(String uuid) {
        return patientRepository
                .findByUuid(uuid)
                .map(PatientResponse::new)
                .orElseThrow(DoctorNotFoundException::new);
    }

    public PatientResponse create(PatientRequest request) {
        return new PatientResponse(patientRepository.save(converter(request)));
    }

    private static Patient converter(PatientRequest request) {
        return Patient.builder()
                .address(Address.builder()
                        .addressNumber(request.address().addressNumber())
                        .state(request.address().state())
                        .zipCode(request.address().zipCode())
                        .city(request.address().city())
                        .complement(request.address().complement())
                        .neighborhood(request.address().neighborhood())
                        .streetName(request.address().streetName())
                        .build())
                .document(request.document())
                .name(request.name())
                .email(request.email())
                .telephone(request.telephone())
                .status(PatientStatus.ACTIVE)
                .build();
    }
}
