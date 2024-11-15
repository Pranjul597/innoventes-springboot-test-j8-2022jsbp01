public class StrengthValidator implements ConstraintValidator<EvenNumberOrZero, Long>{

    public boolean isValid(Long input, ConstraintValidatorContext context){

        if(input == null)
            return true;

        if(input % 2 != 0)
            return false;

        return true;
    }
    
}
