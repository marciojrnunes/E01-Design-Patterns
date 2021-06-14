package strategy.strategy;

public class ValidateCaracteresEspeciais extends Strategy {
    
    boolean validate(String password) {
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (c >= 33 && c <= 47){
                return true;
            }
            if (c >= 58 && c <= 63){
                return true;
            }
            if (c >= 91 && c <= 96){
                return true;
            }
            if (c >= 123 && c <= 126){
                return true;
            }
        }
        System.out.println("Senha não tem caracteres especiais");
        return false;
    }

}
