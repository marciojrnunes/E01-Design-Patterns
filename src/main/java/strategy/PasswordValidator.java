package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    //Estratégia padrão
    public PasswordValidator(){
        this.strategy = new LengthStrategy();
    }

    public void setPasswordStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public PasswordStrategy getStrategy() {
        return strategy;
    }

    public boolean validate(String password) {
        return this.strategy.validate(password);
    }

}
