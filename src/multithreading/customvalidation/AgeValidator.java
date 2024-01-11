package multithreading.customvalidation;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Constraint(validatedBy = AgeValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface AgeValidator {
    String message() default "invalide age";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
