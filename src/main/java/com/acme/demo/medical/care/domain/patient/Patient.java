package com.acme.demo.medical.care.domain.patient;

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

import java.io.Serializable;

import static jakarta.persistence.EnumType.STRING;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Table(name = "patient")
public class Patient extends DomainModelUuid implements Serializable {
    private static final long serialVersionUID = 2405172041950251807L;
    private String name;
    private String email;
    private String telephone;
    private String document;
    @Embedded
    private transient Address address;
    @Enumerated(STRING)
    private PatientStatus status;

}
