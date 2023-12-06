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
    // 필요한 경우 더 많은 필드 추가
}
