package umc.spring.dto;

import lombok.Data;

@Data
public class MyMissionDTO {
    private Long mmId;
    private int dDay;
    private String sof;
    private MissionDTO mission;
    private ManageMissionDTO manageMission;
    // UserDTO 등 필요한 필드 추가
}
