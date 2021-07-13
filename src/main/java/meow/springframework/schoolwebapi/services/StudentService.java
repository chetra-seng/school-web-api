package meow.springframework.schoolwebapi.services;

import meow.springframework.schoolwebapi.entities.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public Student updateStudent(Student student);
    public Student getStudentById(Long id);
    public void deleteStudentById(long id);
}
