package com.rest.demo.Repository;

import com.rest.demo.Etity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student, Long> {
}
