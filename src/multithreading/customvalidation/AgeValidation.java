package multithreading.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class AgeValidation implements ConstraintValidator<AgeValidator, Person> {
    @Override
    public boolean isValid(Person person, ConstraintValidatorContext constraintValidatorContext) {
        return person.getAge() > 0;
    }
}
