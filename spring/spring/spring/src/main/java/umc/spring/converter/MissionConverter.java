package umc.spring.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import umc.spring.Model.Mission;
import umc.spring.dto.MissionDTO;
import umc.spring.dto.MissionRequest;
import org.springframework.stereotype.Component;

@Component
public class MissionConverter {

    public Mission convertToEntity(MissionRequest missionRequest) {
        Mission mission = new Mission();
        mission.setName(missionRequest.getName());
        mission.setCondition(missionRequest.getCondition());
        mission.setPoint(missionRequest.getPoint());
        mission.setTimeLimit(missionRequest.getTimeLimit());
        // Set other fields if needed
        return mission;
    }
    public MissionDTO convertToDTO(Mission mission) {
        MissionDTO missionDTO = new MissionDTO();
        // MissionDTO에 필요한 필드들을 mission에서 가져와서 설정
        missionDTO.setMissionId(mission.getMissionId());
        missionDTO.setName(mission.getName());
        missionDTO.setCondition(mission.getCondition());
        missionDTO.setPoint(mission.getPoint());
        missionDTO.setTimeLimit(mission.getTimeLimit());
        // 필요한 경우 더 많은 설정 추가

        return missionDTO;
    }
}

