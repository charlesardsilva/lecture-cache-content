package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.gateway.StudentGateway;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class StudentServiceNoCache implements StudentService{

    private final StudentGateway studentGateway;

    public StudentServiceNoCache(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    public int amountOfStudents(String productId) {
        return studentGateway.amountOfStudents(productId);
    }
}
