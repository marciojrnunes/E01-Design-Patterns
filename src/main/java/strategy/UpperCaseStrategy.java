package strategy;
 import java.util.regex.*;

public class UpperCaseStrategy extends PasswordStrategy  {

    String upperCharactersString = "ABCDEFGHIJKLMNOPQRSTUVXYWZ";

    public boolean validate(String password) {

        boolean result=false;

        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(upperCharactersString.contains(Character.toString(ch))) {
                result= true;
                break;
            }
        }
        return result;
    }
}
