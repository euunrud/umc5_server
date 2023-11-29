package umc.spring.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import umc.spring.Model.Mission;
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
}

