package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public boolean validate(String password) {
        return strategy.validate(password);
    }

    public PasswordValidator() {
        strategy = new UpperCaseStrategy();
    }

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }
}
