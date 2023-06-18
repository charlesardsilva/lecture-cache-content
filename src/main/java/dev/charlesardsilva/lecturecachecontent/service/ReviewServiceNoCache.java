package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.gateway.ReviewGateway;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class ReviewServiceNoCache implements ReviewService {

    private final ReviewGateway reviewGateway;

    public ReviewServiceNoCache(ReviewGateway reviewGateway) {
        this.reviewGateway = reviewGateway;
    }

    public int rating(String id) {
        return reviewGateway.rating(id);
    }
}
