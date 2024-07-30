package org.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.hospital.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
