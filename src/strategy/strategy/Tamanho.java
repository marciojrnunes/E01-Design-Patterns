package strategy;

public class Tamanho extends PasswordValidator{
    protected int tamanho;

    public Tamanho() {
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    boolean validate(String password) {
        return password.length() >= this.tamanho;
    }
}
