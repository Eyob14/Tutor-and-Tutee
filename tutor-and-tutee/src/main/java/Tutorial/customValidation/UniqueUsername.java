package Tutorial.customValidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy =ValidateUsername.class)
@Documented

public @interface UniqueUsername {

    String message() default "Username already in use!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
