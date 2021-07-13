package meow.springframework.schoolwebapi.repositories;

import meow.springframework.schoolwebapi.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
