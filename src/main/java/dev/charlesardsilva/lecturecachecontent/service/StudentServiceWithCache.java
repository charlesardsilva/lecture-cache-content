package dev.charlesardsilva.lecturecachecontent.service;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceWithCache {

    private final StudentServiceNoCache studentServiceNoCache;

    public StudentServiceWithCache(StudentServiceNoCache studentServiceNoCache) {
        this.studentServiceNoCache = studentServiceNoCache;
    }

    public int amountOfStudents(long productId) {
        return studentServiceNoCache.amountOfStudents(productId);
    }
}
