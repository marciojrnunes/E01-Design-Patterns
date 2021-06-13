package strategy;

public class PasswordValidator {

    private ValidatorStrategy strategy;

    public PasswordValidator(){
        strategy = new LenghtStrategy();
    }

    public void  setValidator(ValidatorStrategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.method(password);
    }

}


