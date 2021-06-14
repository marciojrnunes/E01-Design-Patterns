package strategy;

public class PasswordValidator {
	
	private ValidatorStrategy strategy;

	public PasswordValidator() {
		strategy = new PasswordLenght();
	}

	public void setSortStrategy(ValidatorStrategy strategy) {
	    this.strategy = strategy;
	}
	
    public boolean validate(String password) {
        return strategy.validate(password);
    }

}
