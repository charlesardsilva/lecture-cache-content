package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.gateway.StudentGateway;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceNoCache {

    private final StudentGateway studentGateway;

    public StudentServiceNoCache(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    public int amountOfStudents(long productId) {
        return studentGateway.amountOfStudents(productId);
    }
}
