import java.util.List;

public interface GerenciarProdutos {
    void adicionarProduto(Produto p);
    void removerProduto(List<Produto> removerProduto1, String nome) throws Exception;
    List<Produto> listarProdutos();
    List<Produto> filtrarPorCategoria(List<Produto> produtos, String categoria);
    List<Produto> filtrarPorPreco(List<Produto> numeros,double precoMin, double precoMax);
    List<Produto> ordenarPorNome(List<Produto> nomesOrdenados);
    List<Produto> ordenarPorPreco(List<Produto> precoOrdenado);
    Produto buscarProduto(String nome) throws Exception;
}
