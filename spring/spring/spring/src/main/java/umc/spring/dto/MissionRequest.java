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

    private Date timeLimit;

}
