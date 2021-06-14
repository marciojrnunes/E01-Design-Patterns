package strategy;

public class SpecialCharacters extends ValidatorStrategy{

	@Override
	boolean validate(String password) {
		return password.matches("[0-9]*");
	}

}
