package strategy;

public abstract class PasswordStrategy {

    public abstract boolean validate(String password);
}

class LengthStrategy extends PasswordStrategy{

    @Override
    public boolean validate(String password) {

        if(password.length() >= 8){
            return true;
        }
        return false;
    }
}

class UpperCaseStrategy extends PasswordStrategy{

    @Override
    public boolean validate(String password) {

        for(int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}

class SpecialCharStrategy extends PasswordStrategy{

    @Override
    public boolean validate(String password) {

        String charEspecial= "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        for(int i = 0; i < password.length(); i++){

            char c = password.charAt(i);

            if(charEspecial.contains(Character.toString(c))){
                return true;
            }
        }
        return false;
    }
}
