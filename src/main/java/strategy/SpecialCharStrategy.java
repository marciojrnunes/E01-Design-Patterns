package strategy;

public class SpecialCharStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password) {

        for (char letra: password.toCharArray()) {
            if(!Character.isLetterOrDigit(letra))
                return true;
        }

        return false;
    }
}
