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

}

