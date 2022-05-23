package Endereco;

import Cliente.Cliente;

public class Endereco extends Cliente {

    public String rua;
    private String numero;
    private String sala;
    private String cidade;
    private int cep;
    private String uf;

    public Endereco(int codigoUnico, String nomedoProduto, String categoria, int datadeFrabicacao,
            int datadeVencimento, int preco, String nomedoCliente, String endereco, int telefone, int filiacao,
            String status, int limiteCredito, String rua, String numero, String sala, String cidade, int cep,
            String uf) {
        super(codigoUnico, nomedoProduto, categoria, datadeFrabicacao, datadeVencimento, preco, nomedoCliente,
                endereco, telefone, filiacao, status, limiteCredito);
        this.rua = rua;
        this.numero = numero;
        this.sala = sala;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    // Métodos
    public void nrua(String rua) {
        System.out.println("Rua: " + rua);
    }

    public void nnumero(int numero) {
        System.out.println("Nº: " + numero);
    }

    public void nsala(String sala) {
        System.out.println("Sala: " + sala);
    }

    public void ncidade(String cidade) {
        System.out.println("Cidade: " + cidade);
    }

    public void ncep(int cep) {
        System.out.println("CEP: " + cep);
    }

    public void nuf(String uf) {
        System.out.println("UF: " + uf);
    }

}
