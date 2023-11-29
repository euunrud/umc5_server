package umc.spring.Validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import umc.spring.Validation.annotation.ChallengeMissionCheck;
import umc.spring.repository.MyMissionRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChallengeMissionValidator implements ConstraintValidator<ChallengeMissionCheck, Long> {

    private final MyMissionRepository myMissionRepository;

    @Autowired
    public ChallengeMissionValidator(MyMissionRepository myMissionRepository) {
        this.myMissionRepository = myMissionRepository;
    }

    @Override
    public boolean isValid(Long missionId, ConstraintValidatorContext context) {
        // 해당 미션을 도전 중인지 확인
        return missionId == null || !myMissionRepository.existsByMission_MissionIdAndSof(missionId, "SUCCESS");
    }
}
