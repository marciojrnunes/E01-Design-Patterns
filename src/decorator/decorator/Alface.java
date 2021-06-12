package decorator;

public class Alface extends IngredienteDecorator {


    public Alface(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Alface() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Alface";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 0.3;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}

