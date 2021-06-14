package strategy;

public class PasswordValidator {

    // FIXME só aceita um tipo de validação (por tamanho)
    // public boolean validate(String password) {
    //     return password.length() >= 8;
    // }

    private ValidationStrategy strategy;

    public PasswordValidator() {
        strategy = new EmptyStrategy();
    }

    public void setValidationStrategy(ValidationStrategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.validate(password);
    }
}
