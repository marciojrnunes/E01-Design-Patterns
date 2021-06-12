package decorator;

public class Hamburger extends IngredienteDecorator {


    public Hamburger(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Hamburger() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Hamburger";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 2.1;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
