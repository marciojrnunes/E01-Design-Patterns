package strategy.strategy;

public class PasswordValidator {

    private Strategy strategy;

    public PasswordValidator(){
        strategy = new ValidateSize();
    }

    public boolean validate(String password) {
        return strategy.validate(password);
    }

    public void setValidateStrategy(Strategy strategy){
        this.strategy = strategy;
    }


}
