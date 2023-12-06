package umc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import umc.spring.dto.ReviewDTO;
import umc.spring.repository.ReviewRepository;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Page<ReviewDTO> getReviews(int page) {
        PageRequest pageRequest = PageRequest.of(page - 1, 10);
        return reviewRepository.findAll(pageRequest)
                .map(ReviewDTO::fromEntity);
    }
}
