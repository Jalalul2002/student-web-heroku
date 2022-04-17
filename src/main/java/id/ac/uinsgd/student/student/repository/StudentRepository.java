package id.ac.uinsgd.student.student.repository;

import id.ac.uinsgd.student.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);
}