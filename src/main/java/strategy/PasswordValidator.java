package strategy;

import static java.lang.String.valueOf;

public class PasswordValidator {

    private PasswordStrategy strategy;

    // FIXME só aceita um tipo de validação (por tamanho)
    //public boolean validate(String password) {
      //  return password.length() >= 8;
    //}

    //define a estragégia de validação
    public void setStrategy(PasswordStrategy strategy){
        this.strategy = strategy;
    }

    //faz a validação a partir da strategia definida
    public boolean validate (String password) {

        return strategy.validate(valueOf(this));
    }

}
