package umc.spring.converter;

import org.springframework.stereotype.Component;
import umc.spring.Model.MyMission;
import umc.spring.dto.MyMissionDTO;


@Component
public class MyMissionConverter {

    private final MissionConverter missionConverter;
    private final ManageMissionConverter manageMissionConverter;

    public MyMissionConverter(MissionConverter missionConverter, ManageMissionConverter manageMissionConverter) {
        this.missionConverter = missionConverter;
        this.manageMissionConverter = manageMissionConverter;
    }

    public MyMissionDTO convertToDTO(MyMission myMission) {
        MyMissionDTO myMissionDTO = new MyMissionDTO();
        myMissionDTO.setMmId(myMission.getMmId());
        myMissionDTO.setDDay(myMission.getDDay());
        myMissionDTO.setSof(myMission.getSof());
        myMissionDTO.setMission(missionConverter.convertToDTO(myMission.getMission()));
        myMissionDTO.setManageMission(manageMissionConverter.convertToDTO(myMission.getManageMission()));
        // UserDTO 등 필요한 필드 설정

        return myMissionDTO;
    }
}
