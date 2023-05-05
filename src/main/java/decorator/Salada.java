package decorator;

public class Salada extends Ingredientes {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente, "Salada", 0.25);
    }

    public Salada() {
        this(null);
    }
}
