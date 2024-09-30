public abstract class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String categoria, double preco, String produto) {
        this.categoria = categoria;
        this.preco = preco;
        this.nome = produto;
    }




    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria(){
        return categoria;
    }
    
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Categoria: " + categoria;
    }


}
