package umc.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import umc.spring.Validation.annotation.StoreExistenceCheck;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<String> addReview(
            @RequestBody @Validated ReviewRequest reviewRequest,
            @StoreExistenceCheck Long storeId
    ) {
        // 여기서 storeId는 가게의 존재가 검증된 값입니다.
        // 리뷰를 추가하는 비즈니스 로직을 수행합니다.
        // ...
        return ResponseEntity.ok("Review added successfully");
    }
}
