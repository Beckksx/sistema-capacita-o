package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quatidade;
    private double valorTotalDoEstoque;

    public double valorTotalDoEstoque(int quantidade, double preco){
        this.valorTotalDoEstoque = quantidade * preco; 
        
    }
    public void addProdutos(int quantidade){
        
    }
    
    public void removerProdutos(int quantidade){
        
    }
    Produto(){}
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }
}
