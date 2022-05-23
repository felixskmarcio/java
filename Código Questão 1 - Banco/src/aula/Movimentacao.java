package aula;

public class Movimentacao {
    
    //Atributos
    private String descricao;
    private double valor;
    private char informacao;
    
    //Construtor
    public Movimentacao(String descricao, double valor, char informacao){
        this.descricao = descricao;
        this.valor = valor;
        this.informacao = informacao;
    }
    
        
    //Métodos

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getInformacao() {
        return informacao;
    }

    public void setInformacao(char informacao) {
        this.informacao = informacao;
    }
    
    
    
    
    
            
}
