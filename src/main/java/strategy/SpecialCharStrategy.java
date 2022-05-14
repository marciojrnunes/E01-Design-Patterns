public class SpecialCharStrategy extends PasswordStrategy {

    boolean validate(String password) {

        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        
        for (int i = 0; i < password.length(); i++){

            char c = password.charAt(i);

            if(specialCharactersString.contains(Character.toString(c))) {
                return true;
            }    
    
        }
        
        return false;
    }

}