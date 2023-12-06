package umc.spring.dto;

import lombok.Data;
import umc.spring.Validation.annotation.ChallengeMissionCheck;

import javax.validation.constraints.NotNull;

@Data
public class ChallengeMissionRequest {
    @NotNull(message = "Mission ID cannot be null")
    @ChallengeMissionCheck
    private Long missionId;

}
