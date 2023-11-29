package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.Model.Mission;
import umc.spring.Model.Mission;

import java.util.Optional;

public interface MissionRepository  extends JpaRepository<Mission, Long> {
    Optional<Mission> findByStoreId(Long storeId);
}

