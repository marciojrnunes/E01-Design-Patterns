package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return this.ingrediente.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return this.ingrediente.valorDoIngrediente() + 0.75;
    }
}