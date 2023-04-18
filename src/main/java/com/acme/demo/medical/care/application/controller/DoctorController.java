package com.acme.demo.medical.care.application.controller;

import com.acme.demo.medical.care.application.request.DoctorRequest;
import com.acme.demo.medical.care.application.response.DoctorResponse;
import com.acme.demo.medical.care.domain.doctor.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    @ResponseStatus(CREATED)
    @PostMapping
    public ResponseEntity<Void> create(
            @RequestBody @Valid DoctorRequest request) {

        return ResponseEntity
                .created(fromCurrentRequest()
                        .path("/{uuid}")
                        .buildAndExpand(doctorService.create(request).uuid())
                        .toUri())
                .build();
    }

    @ResponseStatus(OK)
    @GetMapping("/{uuid}")
    public DoctorResponse get(
            @PathVariable("uuid") String uuid) {
        return doctorService.getDoctorByUuid(uuid);
    }
}
