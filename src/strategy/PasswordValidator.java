package strategy;

public class PasswordValidator {

    // FIXME só aceita um tipo de validação (por tamanho)
    private PasswordValidatorStrategy strategy;

    public void PasswordValidator() {
        strategy = new LengthValidator();
    }

    public void setStrategy(PasswordValidatorStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.validatePassword(password);
    }

}
