package Cliente;

import Produto.Produto;

public class Cliente extends Produto {

    private String nomedoCliente;
    private String endereco;
    private int telefone;
    private int filiacao;
    private String status;
    private int limiteCredito;

    public Cliente(int codigoUnico, String nomedoProduto, String categoria, int datadeFrabicacao, int datadeVencimento,
            int preco, String nomedoCliente, String endereco, int telefone, int filiacao, String status,
            int limiteCredito) {
        super(codigoUnico, nomedoProduto, categoria, datadeFrabicacao, datadeVencimento, preco);
        this.nomedoCliente = nomedoCliente;
        this.endereco = endereco;
        this.telefone = telefone;
        this.filiacao = filiacao;
        this.status = status;
        this.limiteCredito = limiteCredito;
    }

    public String getNomedoCliente() {
        return nomedoCliente;
    }

    public void setNomedoCliente(String nomedoCliente) {
        this.nomedoCliente = nomedoCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(int filiacao) {
        this.filiacao = filiacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    // Métodos
    public void nCliente(String nomedoCliente) {
        System.out.println("Nome do Cliente: " + nomedoCliente);
    }

    public void nEndereco(String endereco) {
        System.out.println("Nome do Endereço: " + endereco);
    }

    public void ntelefone(double t) {
        System.out.println("Número do Telefone: " + telefone);
    }

    public void nfiliacao(int string) {
        System.out.println("Número da Filiação: " + string);
    }

    public void nstatus(String status) {
        System.out.println("Status: " + status);
    }

    public void nlimiteCredito(double d) {
        System.out.println("Limite de Crédito: " + status);
    }

}
