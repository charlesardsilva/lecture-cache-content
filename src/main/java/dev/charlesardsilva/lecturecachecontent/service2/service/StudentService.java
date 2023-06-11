package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.gateway.StudentGateway;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentGateway studentGateway;

    public StudentService(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    public int amountOfStudents(long productId) {
        return studentGateway.amountOfStudents(productId);
    }
    public int amountOfStudentsWithCache(long productId) {
        return amountOfStudents(productId);
    }
}
