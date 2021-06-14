package decorator;

public class Carne extends IngredienteDecorator{

    public Carne(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Carne() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Carne";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 2.0;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
