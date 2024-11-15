public class CompanyCodeValidator implements ConstraintValidator<ValidateCompanyCode, String>{

    public boolean isValid(String input, ConstraintValidatorContext context){
        if(input == null)
            return true;
        if(input.length() != 5)
            return false;
        String temp = input.substring(0,2).toLowerCase();
        char firstChar = temp.charAt(0);
        char secondChar = temp.charAt(1);

        if(firstChar < 'a' || firstChar > 'z' || secondChar < 'a' || secondChar > 'z')
            return false;
        
        String thirdAndFourthChar = input.substring(2, 4);
        char firstNo = thirdAndFourthChar.charAt(0);
        char secondNo = thirdAndFourthChar.charAt(1);

        if(firstNo < '0' || firstNo > '9' || secondNo < '0' || secondNo > '9')
            return false;
        
        String lastChar = input.substring(4,5);
        if(lastChar.toLowerCase().charAt(0) != 'e' && lastChar.toLowerCase().charAt(0) != 'n')
            return false;

        return true;
    }
        
}
