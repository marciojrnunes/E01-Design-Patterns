package strategy.strategy;

public class ValidateSize extends Strategy {

    boolean validate(String password){
        if (password.length() < 8){
            System.out.println("Senha tem menos de 8 dígitos");
            return false;
        }
        return true;
    }
}