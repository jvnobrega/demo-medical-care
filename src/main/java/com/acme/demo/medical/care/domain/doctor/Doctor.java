package com.acme.demo.medical.care.domain.doctor;

import com.acme.demo.medical.care.commons.domain.DomainModelUuid;
import com.acme.demo.medical.care.domain.address.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import static jakarta.persistence.EnumType.STRING;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Table(name = "doctor")
public class Doctor extends DomainModelUuid {
    private String name;
    private String email;
    private String telephone;
    private String crm;
    @Enumerated(STRING)
    private MedicalSpecialty medicalSpecialty;
    @Embedded
    private Address address;
    @Enumerated(STRING)
    private DoctorStatus status;

}
