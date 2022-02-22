package fastfood;

public class Vegetariano extends Menu{

    private double embalagem;
    private boolean temperos;

    public Vegetariano(double precoBase, double embalagem, boolean temperos) {
        super(precoBase);
        this.embalagem = embalagem;
        this.temperos = temperos;
    }

    @Override
    public void montar() { System.out.println ("Embalagem especial terá acréscimo de 1%.");

    }

    @Override
    public double precoVenda() {
        if (temperos){
            return (precoBase + embalagem) * 1.01;
        } else
            return precoBase + embalagem;
    }
}
