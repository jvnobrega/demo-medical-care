package com.acme.demo.medical.care.domain.patient;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Long> {

    Optional<Patient> findByUuid(String uuid);
}
