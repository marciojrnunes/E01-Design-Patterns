package strategy;

public class PresencaDeCaracteresEspeciais extends PasswordValidator{

    protected boolean presencaDeCaracteresEspeciais;

    public PresencaDeCaracteresEspeciais () {
    }

    public void setPresencaDeCaracteresEspeciais(boolean presencaDeCaracteresEspeciais) {
        this.presencaDeCaracteresEspeciais = presencaDeCaracteresEspeciais;
    }

    @Override
    boolean validate(String password) {
        boolean presencaDeCaracteresEspeciais = true;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isUnicodeIdentifierPart(ch)) {
                presencaDeCaracteresEspeciais = true;
            }
            else {
                presencaDeCaracteresEspeciais = false;
            }
        }
        return presencaDeCaracteresEspeciais == this.presencaDeCaracteresEspeciais;
    }
}
