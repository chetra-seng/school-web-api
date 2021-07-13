package meow.springframework.schoolwebapi.bootstraps;

import meow.springframework.schoolwebapi.entities.Student;
import meow.springframework.schoolwebapi.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

public class StudentBootStrap implements CommandLineRunner {
    private final StudentRepository studentRepository;

    public StudentBootStrap(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Chetra", "Seng", "sengchetra.love@icloud.com");
        studentRepository.save(student1);
        System.out.println("Added student");
    }
}
