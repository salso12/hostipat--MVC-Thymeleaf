package org.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.hospital.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
