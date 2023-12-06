package umc.spring.dto;

import lombok.Builder;
import lombok.Data;
import umc.spring.Model.Review;

import java.util.Date;

@Data
@Builder
public class ReviewDTO {
    private Long reviewId;
    private String reviewer;
    private int score;
    private String content;
    private Date reviewDate;

    public static ReviewDTO fromEntity(Review review) {
        return ReviewDTO.builder()
                .reviewId(review.getReviewId())
                .reviewer(review.getReviewer())
                .score(review.getScore())
                .content(review.getContent())
                .reviewDate(review.getReviewDate())
                .build();
    }
}

