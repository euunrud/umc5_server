package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.Model.Mission;
import umc.spring.Model.MyMission;
import umc.spring.Model.User;

public interface MyMissionRepository extends JpaRepository<MyMission, Long> {
    boolean existsByUserAndMissionAndSof(User user, Mission mission, String sof);
    boolean existsByMission_MissionIdAndSof(Long missionId, String sof);

}
