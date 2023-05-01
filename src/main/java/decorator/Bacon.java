package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return this.ingrediente.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return this.ingrediente.valorDoIngrediente() + 1.5;
    }
}