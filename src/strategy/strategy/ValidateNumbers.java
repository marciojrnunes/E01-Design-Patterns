package strategy.strategy;

public class ValidateNumbers extends Strategy{

    boolean validate(String password) {
        
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (c >= 48 && c <= 57){
                return true;
            }
        }
        System.out.println("Senha não tem números");
        return false;
    }
    
}
