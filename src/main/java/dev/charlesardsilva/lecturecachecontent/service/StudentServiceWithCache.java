package dev.charlesardsilva.lecturecachecontent.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceWithCache implements StudentService {

    private final StudentServiceNoCache studentServiceNoCache;

    public StudentServiceWithCache(StudentServiceNoCache studentServiceNoCache) {
        this.studentServiceNoCache = studentServiceNoCache;
    }

    @Cacheable("students")
    public int amountOfStudents(String productId) {
        return studentServiceNoCache.amountOfStudents(productId);
    }
}
