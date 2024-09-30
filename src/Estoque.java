import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.crypto.NoSuchMechanismException;

public class Estoque  implements GerenciarProdutos{
    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
        produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    @Override
    public void removerProduto(List<Produto> removerProduto1,String nome) throws Exception {
        Produto produto = buscarProduto(nome);
        produtos.remove(produto);

    }

    @Override
    public List<Produto> listarProdutos() {
        for(Produto produto : produtos){
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + "Categoria" + produto.getCategoria());
        }
        return produtos;
    }


    @Override
    public List<Produto> filtrarPorCategoria(List<Produto> produtos, String categoria) {
        return produtos.stream()
                      .filter(produto -> produto.getCategoria().equals(categoria))
                      .collect(Collectors.toList());

    }

    @Override
    public List<Produto> filtrarPorPreco(List<Produto> produtos, double precoMin, double precoMax) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMin && produto.getPreco() <= precoMax)
                .collect(Collectors.toList());
    }

    @Override
    public List<Produto> ordenarPorNome(List<Produto> nomesOrdenados) {
        return nomesOrdenados.stream()
                                    .sorted(Comparator.comparing(Produto::getNome))
                                    .collect(Collectors.toList());

    };

    @Override
    public List<Produto> ordenarPorPreco(List<Produto> precoOrdenado) {
        return precoOrdenado.stream()
                                    .sorted(Comparator.comparing(Produto::getPreco))
                                    .collect(Collectors.toList());
    }

    @Override
    public Produto buscarProduto(String nome) throws Exception {
                return produtos.stream()   
                                        .filter(Produto -> Produto.getNome().equalsIgnoreCase(nome))
                                        .findFirst()
                                        .orElseThrow(() -> new Exception("Produto não encontrado"));

}

    @Override
    public String toString() {
        return super.toString();
    }

  

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

  

    
}
