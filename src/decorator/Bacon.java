package decorator;

public class Bacon extends IngredienteDecorator{

    // criando construtor
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    // implementando métodos herdados
    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Bacon";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 2.50;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
