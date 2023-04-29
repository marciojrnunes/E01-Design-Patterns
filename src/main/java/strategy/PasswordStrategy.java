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

        // Passa por todos os caracteres da senha
        for(int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            // Verifica se possui alguma caractere maiúscula
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

        String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        for(int i = 0; i < password.length(); i++){

            char c = password.charAt(i);

            if(special.contains(Character.toString(c))){
                return true;
            }
        }

        return false;
    }
}
