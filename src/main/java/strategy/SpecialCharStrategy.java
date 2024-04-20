package strategy;

public class SpecialCharStrategy extends PasswordStrategy{

    @Override
    public boolean validate(String password) {
        String specialChars = "!()*&¨%$#@^~{}[]?/-_";
        for (char c : specialChars.toCharArray()) {
            if (password.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }
}
