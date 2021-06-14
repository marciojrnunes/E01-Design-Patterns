package strategy.strategy;

public class ValidateLetrasMaiusculas extends Strategy {
    boolean validate(String password){
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (c >= 65 && c <= 90){
                return true;
            }
        }
        System.out.println("Senha não tem letras maiúsculas");
        return false;
    }
}