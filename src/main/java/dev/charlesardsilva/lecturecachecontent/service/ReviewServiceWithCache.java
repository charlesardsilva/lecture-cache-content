package dev.charlesardsilva.lecturecachecontent.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class ReviewServiceWithCache implements ReviewService{

    private final ReviewServiceNoCache reviewServiceNoCache;

    public ReviewServiceWithCache(ReviewServiceNoCache reviewServiceNoCache) {
        this.reviewServiceNoCache = reviewServiceNoCache;
    }

    @Cacheable("reviews")
    public double rating(String id) {
        return reviewServiceNoCache.rating(id);
    }
}
