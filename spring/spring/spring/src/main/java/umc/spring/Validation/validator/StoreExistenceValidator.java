package umc.spring.Validation.validator;

import umc.spring.Validation.annotation.StoreExistenceCheck;
import umc.spring.service.StoreService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StoreExistenceValidator implements ConstraintValidator<StoreExistenceCheck, Long> {

    // StoreService는 가게 관련 비즈니스 로직을 처리하는 서비스 클래스로 가정합니다.
    private final StoreService storeService;

    public StoreExistenceValidator(StoreService storeService) {
        this.storeService = storeService;
    }

    @Override
    public boolean isValid(Long storeId, ConstraintValidatorContext context) {
        // 가게 ID가 null이거나 존재하지 않으면 유효하지 않다고 판단합니다.
        return storeId != null && storeService.isStoreExist(storeId);
    }
}
