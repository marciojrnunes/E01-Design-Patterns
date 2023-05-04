package strategy;

public class LengthStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {

       if (password.length() <= 8) {
           System.out.println("Senha deve conter pelo menos 8 caracteres.");
       } else {
           System.out.println("Bem-vindo");
       }

       return password.length() >= 8;
    }
}
