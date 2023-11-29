package umc.spring.Validation.annotation;

import umc.spring.Validation.validator.ChallengeMissionValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ChallengeMissionValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ChallengeMissionCheck {
    String message() default "This mission is already being challenged by the user.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
