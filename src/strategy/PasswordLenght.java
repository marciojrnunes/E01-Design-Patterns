package strategy;

public class PasswordLenght extends ValidatorStrategy{

	@Override
	public boolean validate(String password) {
		return password.length() >= 8;
	}
}
