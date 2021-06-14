package decorator;

public class Maionese extends IngredienteDecorator {

    public Maionese(Ingrediente ingrediente){
        super(ingrediente);
    }


    public Maionese(){
        super(null);
    }


    public String imprimeIngrediente() {
        String ingredientes = "Maionese";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }


    public double valorDoIngrediente() {

        double valor = 1.30;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
