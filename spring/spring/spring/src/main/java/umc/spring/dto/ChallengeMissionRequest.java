package umc.spring.dto;

import lombok.Data;
import umc.spring.Validation.annotation.ChallengeMissionCheck;

import javax.validation.constraints.NotNull;

@Data
public class ChallengeMissionRequest {
    @NotNull(message = "Mission ID cannot be null")
    @ChallengeMissionCheck
    private Long missionId;

    // 추가적인 필드가 있다면 여기에 추가할 수 있습니다.
}
