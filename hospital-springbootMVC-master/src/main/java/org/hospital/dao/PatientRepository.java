package org.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.hospital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
