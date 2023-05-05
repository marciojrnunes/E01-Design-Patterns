package decorator;

public abstract class Ingredientes implements Ingrediente {

    protected Ingrediente ingrediente;
    protected String nome;
    protected double preco;

    public Ingredientes(Ingrediente ingrediente, String nome, double preco) {
        this.ingrediente = ingrediente;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String imprimeIngrediente() {
        if (this.ingrediente != null) {
            return this.nome + ", " + this.ingrediente.imprimeIngrediente();
        } else {
            return this.nome;
        }
    }

    @Override
    public double valorDoIngrediente() {
        if (this.ingrediente != null) {
            return this.preco + this.ingrediente.valorDoIngrediente();
        } else {
            return this.preco;
        }
    }
}
