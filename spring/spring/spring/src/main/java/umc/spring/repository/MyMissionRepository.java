package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.Model.Mission;
import umc.spring.Model.MyMission;
import umc.spring.Model.User;

import java.util.Optional;

public interface MyMissionRepository extends JpaRepository<MyMission, Long> {
    boolean existsByUserAndMissionAndSof(User user, Mission mission, String sof);
    boolean existsByMission_MissionIdAndSof(Long missionId, String sof);
    Optional<MyMission> findByMissionAndUser(Mission mission, User user);
    Page<MyMission> findByUserAndSof(Long userId, String sof, Pageable pageable);
}
