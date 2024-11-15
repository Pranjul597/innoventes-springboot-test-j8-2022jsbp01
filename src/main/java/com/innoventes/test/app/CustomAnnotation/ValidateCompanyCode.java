
@Target(ElementType.FIELD, ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {CompanyCodeValidator.class})
public @interface ValidateCompanyCode {
    
    String message() default "Not a valid companyCode";

    Class<?>[] groups() default {};

    Class<? extends payload>[] payload() default {};

}
