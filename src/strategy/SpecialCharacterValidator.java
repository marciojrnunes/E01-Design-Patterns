package strategy;

public class SpecialCharacterValidator extends PasswordValidatorStrategy{

    @Override
    boolean validatePassword(String password) {
        return password.matches("[0-9]_@*");
    }
}
