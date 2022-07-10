package src.model;
public class Multa { // classe Multa

    // variáveis de instância
    private int id_multa;
    private int id_cliente;
    private String descricao;
    private float valor;

    // construtor
    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
        this.id_multa = id_multa;
        this.id_cliente = id_emprestimo;
        this.descricao = descricao;
        this.valor = valor;
    }

    // chamando o método
    public Multa() {
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
