package umc.spring.Validation.annotation;

import umc.spring.Validation.validator.PageValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PageValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPage {
    String message() default "Invalid page number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
