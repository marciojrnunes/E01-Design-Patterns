package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return this.ingrediente.imprimeIngrediente() + ", Salada";
    }

    @Override
    public double valorDoIngrediente() {
        return this.ingrediente.valorDoIngrediente() + 0.25;
    }
}