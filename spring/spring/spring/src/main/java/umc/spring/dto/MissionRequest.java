package umc.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class MissionRequest {
    @NotBlank(message = "Mission name cannot be blank")
    private String name;

    @NotBlank(message = "Mission condition cannot be blank")
    private String condition;

    @NotNull(message = "Mission point cannot be null")
    private Integer point;

    // timeLimit이 필수가 아니라면 @NotNull을 제거할 수 있습니다.
    private Date timeLimit;

    // 추가적인 필드가 있다면 여기에 추가할 수 있습니다.
}
