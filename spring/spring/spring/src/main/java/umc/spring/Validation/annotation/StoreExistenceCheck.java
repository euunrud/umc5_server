package umc.spring.Validation.annotation;

import umc.spring.Validation.validator.StoreExistenceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = StoreExistenceValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface StoreExistenceCheck {
    String message() default "The specified store does not exist.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}