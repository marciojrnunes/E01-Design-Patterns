package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(){
        super(null);
    }

    public Bacon(Ingrediente ingrediente){
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Bacon";

        if (super.ingrediente != null) ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 1.5;

        if (super.ingrediente != null) valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
