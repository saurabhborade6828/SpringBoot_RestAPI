package org.jsp.Rest_Api.repository;

import java.util.Optional;

import org.jsp.Rest_Api.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	Optional<Student> findByName(String name);
  
}
