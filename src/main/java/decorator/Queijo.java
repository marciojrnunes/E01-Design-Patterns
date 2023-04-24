package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(){
        super(null);
    }

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.75;

        if(super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

            return valor;

    }


}
