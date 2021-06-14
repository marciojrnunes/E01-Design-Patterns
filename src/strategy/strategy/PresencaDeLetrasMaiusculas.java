package strategy;

public class PresencaDeLetrasMaiusculas extends PasswordValidator{

    protected boolean presencaDeLetrasMaiusculas;

    public PresencaDeLetrasMaiusculas () {
    }

    public void setPresencaDeLetrasMaiusculas(boolean presencaDeLetrasMaiusculas) {
        this.presencaDeLetrasMaiusculas = presencaDeLetrasMaiusculas;
    }

    @Override
    boolean validate(String password) {
        boolean presencaDeLetrasMaiusculas = true;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                presencaDeLetrasMaiusculas = true;
            }
            else {
                presencaDeLetrasMaiusculas = false;
            }
        }
        return presencaDeLetrasMaiusculas == this.presencaDeLetrasMaiusculas;
    }
}
