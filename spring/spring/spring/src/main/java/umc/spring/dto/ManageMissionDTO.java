package umc.spring.dto;

import lombok.Data;

@Data
public class ManageMissionDTO {
    private Long mngId;
    private String location;
    private int msCnt;
    private int point;
    // UserDTO 등 필요한 필드 추가
}
