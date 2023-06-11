package dev.charlesardsilva.lecturecachecontent.service2.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceWithCache implements StudentService {

    private final StudentServiceNoCache studentServiceNoCache;

    public StudentServiceWithCache(StudentServiceNoCache studentServiceNoCache) {
        this.studentServiceNoCache = studentServiceNoCache;
    }

    @Cacheable
    public int amountOfStudents(long productId) {
        return studentServiceNoCache.amountOfStudents(productId);
    }
}
