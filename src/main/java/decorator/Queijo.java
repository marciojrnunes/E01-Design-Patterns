package decorator;

public class Queijo extends Ingredientes {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente, "Queijo", 0.75);
    }

    public Queijo() {
        this(null);
    }
}
