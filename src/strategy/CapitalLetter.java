package strategy;

public class CapitalLetter extends ValidatorStrategy{

	@Override
	boolean validate(String password) {
		boolean has = false; 
		
		for(char i : password.toCharArray()) {
			if(Character.isUpperCase(i)) {
				has = true;
			}
		}
		
		return has;
	}

}
