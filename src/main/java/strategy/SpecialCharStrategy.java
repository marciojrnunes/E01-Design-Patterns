package strategy;

public class SpecialCharStrategy extends PasswordStrategy  {

    String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

    public boolean validate(String password) {

        boolean result=false;

        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                result= true;
                break;
            }
        }
        return result;
    }

}
