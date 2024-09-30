
public class Main {
    public static void main(String[] args) throws Exception {
          
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new ProdutoHerdado("Fruta", 10.0, "Maçã"));
        estoque.adicionarProduto(new ProdutoHerdado("Eletrônicos", 299.99, "Celular"));

        estoque.listarProdutos();
}

}
