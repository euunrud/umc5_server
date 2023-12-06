package umc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.spring.Model.Mission;
import umc.spring.Model.MyMission;
import umc.spring.Model.User;
import umc.spring.dto.ChallengeMissionRequest;
import umc.spring.repository.MissionRepository;
import umc.spring.repository.MyMissionRepository;
import umc.spring.repository.UserRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class ChallengeMissionService {

    private final MyMissionRepository myMissionRepository;
    private final MissionRepository missionRepository;
    private final UserRepository userRepository;

    @Autowired
    public ChallengeMissionService(MyMissionRepository myMissionRepository, MissionRepository missionRepository, UserRepository userRepository) {
        this.myMissionRepository = myMissionRepository;
        this.missionRepository = missionRepository;
        this.userRepository = userRepository;
    }

    public void challengeMission(ChallengeMissionRequest challengeMissionRequest, Long userId) {
        Mission mission = missionRepository.findById(challengeMissionRequest.getMissionId())
                .orElseThrow(() -> new EntityNotFoundException("Mission not found with id: " + challengeMissionRequest.getMissionId()));

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));

        // 해당 미션을 도전 중인지 검증 (커스텀 어노테이션 활용)
        if (myMissionRepository.existsByUserAndMissionAndSof(user, mission, "SUCCESS")) {
            throw new IllegalArgumentException("User is already challenging this mission.");
        }

        MyMission myMission = MyMission.builder()
                .mission(mission)
                .user(user)
                .sof("DOING")
                .build();

        myMissionRepository.save(myMission);
    }
}
