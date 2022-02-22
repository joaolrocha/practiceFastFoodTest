package fastfood;

public class Adulto extends Menu {

    public Adulto(double precoBase) {
        super(precoBase);
    }

    @Override
    public void montar() {

    }

    @Override
    public double precoVenda() {
        return precoBase;

    }
}
