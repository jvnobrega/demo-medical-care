package com.acme.demo.medical.care.domain.doctor;

import com.acme.demo.medical.care.application.request.DoctorRequest;
import com.acme.demo.medical.care.application.response.DoctorResponse;
import com.acme.demo.medical.care.domain.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.acme.demo.medical.care.domain.doctor.DoctorStatus.ACTIVE;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorResponse getDoctorByUuid(String uuid) {
        return doctorRepository
                .findByUuid(uuid)
                .map(DoctorResponse::new)
                .orElseThrow(DoctorNotFoundException::new);
    }

    public DoctorResponse create(DoctorRequest request) {
        return new DoctorResponse(doctorRepository.save(converter(request)));
    }

    private static Doctor converter(DoctorRequest request) {
        return Doctor.builder()
                .address(Address.builder()
                        .addressNumber(request.address().addressNumber())
                        .state(request.address().state())
                        .zipCode(request.address().zipCode())
                        .city(request.address().city())
                        .complement(request.address().complement())
                        .neighborhood(request.address().neighborhood())
                        .streetName(request.address().streetName())
                        .build())
                .crm(request.crm())
                .name(request.name())
                .email(request.email())
                .medicalSpecialty(request.specialty())
                .telephone(request.telephone())
                .status(ACTIVE)
                .build();
    }
}
