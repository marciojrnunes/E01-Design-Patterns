package decorator;

public class BatataPalha extends IngredienteDecorator{

    // criando construtor
    public BatataPalha(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public BatataPalha() {
        super(null);
    }

    // implementando métodos herdados
    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Batata Palha";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 1.50;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
