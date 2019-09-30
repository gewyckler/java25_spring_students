package pl.javagda25.spring.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javagda25.spring.students.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
