package umc.spring.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.spring.Validation.annotation.CheckPage;
import umc.spring.Validation.annotation.StoreExistenceCheck;
import umc.spring.dto.ReviewDTO;
import umc.spring.dto.ReviewRequest;
import umc.spring.service.ReviewService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    @ApiOperation("자신이 작성한 리뷰 조회 API입니다.")
    public Page<ReviewDTO> getReviews(@RequestParam(name = "page") @Valid @CheckPage Integer page) {
        return reviewService.getReviews(page);
    }
}
