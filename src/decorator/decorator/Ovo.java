package decorator;

public class Ovo extends IngredienteDecorator {


    public Ovo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ovo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Ovo";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 0.6;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}

