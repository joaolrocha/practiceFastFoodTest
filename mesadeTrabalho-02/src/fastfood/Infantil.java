package fastfood;

public class Infantil extends Menu{

    private String presenteSurpresa;
    private double valorAdicional;

    public Infantil(double precoBase, String presenteSurpresa, double valorAdicional) {
        super(precoBase);
        this.presenteSurpresa = presenteSurpresa;
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double precoVenda() {
        return precoBase + valorAdicional;
    }

    @Override
    public void montar() {
        System.out.println("Pedidos infantis tem uma surpresa que gera um custo adicional");

    }
}
