package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotalDoEstoque;

    public double valorTotalDoEstoque(int quantidade, double preco){
        return this.valorTotalDoEstoque = quantidade * preco; 
        
    }
    public void addProdutos(int quantidade){
        this.quantidade =+ quantidade;
        
    }
    
    public void removerProdutos(int quantidade){
        
        this.quantidade =- quantidade;
    }

    public Produto(){}
    

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
        return quantidade;
    }

    public void setQuatidade(int quatidade) {
        this.quantidade = quatidade;
    }
}
