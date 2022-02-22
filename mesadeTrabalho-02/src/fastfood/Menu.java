package fastfood;

public abstract class Menu {

    public double precoBase;

    public Menu(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract void montar();

    public abstract double precoVenda();

}
