package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return this.ingrediente.imprimeIngrediente() + ", Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        return this.ingrediente.valorDoIngrediente() + 1.0;
    }
}