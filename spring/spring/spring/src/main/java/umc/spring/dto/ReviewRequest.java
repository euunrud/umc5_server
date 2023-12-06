package umc.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ReviewRequest {
    @NotBlank(message = "Reviewer name cannot be blank")
    private String reviewer;

    @NotNull(message = "Review score cannot be null")
    private Integer score;

    @NotBlank(message = "Review content cannot be blank")
    private String content;

    // 추가적인 필드가 있다면 여기에 추가할 수 있습니다.
}

