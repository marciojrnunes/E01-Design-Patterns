package strategy;

public class UpperCaseStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        for (int i = 0; i < password.length(); i++){

            char c = password.charAt(i);

            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
}
