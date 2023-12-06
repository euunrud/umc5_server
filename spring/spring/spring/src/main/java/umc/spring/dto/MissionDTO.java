package umc.spring.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MissionDTO {
    private Long missionId;
    private String name;
    private String condition;
    private int point;
    private Date timeLimit;
}
