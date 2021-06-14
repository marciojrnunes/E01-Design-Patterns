package decorator;

public class Azeitona extends IngredienteDecorator{

    public Azeitona(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Azeitona() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Azeitona";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 0.5;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}

