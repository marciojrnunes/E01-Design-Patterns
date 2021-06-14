package decorator;

public class CarneHamburger extends IngredienteDecorator{

    public CarneHamburger(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public CarneHamburger() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Carne de Hambúrger";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 3.0;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
