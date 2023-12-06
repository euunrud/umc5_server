package umc.spring.converter;

import org.springframework.stereotype.Component;
import umc.spring.Model.ManageMission;
import umc.spring.dto.ManageMissionDTO;

@Component
public class ManageMissionConverter {

    public ManageMissionDTO convertToDTO(ManageMission manageMission) {
        ManageMissionDTO manageMissionDTO = new ManageMissionDTO();
        manageMissionDTO.setMngId(manageMission.getMngId());
        manageMissionDTO.setLocation(manageMission.getLocation());
        manageMissionDTO.setMsCnt(manageMission.getMsCnt());
        manageMissionDTO.setPoint(manageMission.getPoint());
        // UserDTO 등 필요한 필드 설정

        return manageMissionDTO;
    }
}
