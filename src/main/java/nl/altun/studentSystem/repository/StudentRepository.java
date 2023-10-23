package nl.altun.studentSystem.repository;

import nl.altun.studentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
