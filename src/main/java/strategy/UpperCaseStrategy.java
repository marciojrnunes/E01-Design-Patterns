package strategy;

public class UpperCaseStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password) {

        for(char letra : password.toCharArray()){
            if(Character.isUpperCase(letra))
                return true;
        }

        return false;
    }
}
