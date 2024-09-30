public class ProdutoHerdado extends Produto{

    public ProdutoHerdado(String categoria, double preco, String produto) {
        super(categoria, preco, produto);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
    
}
