package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        String specialCharString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        for (int i = 0; i < password.length(); i++){

            char c = password.charAt(i);

            if(specialCharString.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }
}
