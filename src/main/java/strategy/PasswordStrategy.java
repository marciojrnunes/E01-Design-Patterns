package strategy;

public abstract class PasswordStrategy {

    public abstract boolean validate(String password);

}

class LengthStrategy extends PasswordStrategy{

    public boolean validate(String password){
        if (password.length() >= 8)
            return true;
        else 
            return false;
    }
}

class UpperCaseStrategy extends PasswordStrategy{
    public boolean validate(String password){
        for(int i = 0; i<password.length();i++){
            if(password.charAt(i) > 64 && password.charAt(i)<91)
                return true;
        }
        return false;
    }
}
class SpecialCharStrategy extends PasswordStrategy{
    public boolean validate(String password){
        for(int i = 0; i<password.length();i++){
            if(password.charAt(i) > 34 && password.charAt(i)<39)
                return true;
        }
        return false;
    }
}