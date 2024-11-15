
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {StrengthValidator.class})
public @interface EvenNumberOrZero {
    
    String message() default "Not have enough strength";

    Class<?>[] groups() default {};

    Class<? extends payload>[] payload() default {};

}
