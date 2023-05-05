package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%^&*()\\-=_+\\[\\]{};':\"\\\\|,.<>\\/?].*";

    @Override
    public boolean validate(String password) {
        return password.matches(SPECIAL_CHAR_REGEX);
    }
}
