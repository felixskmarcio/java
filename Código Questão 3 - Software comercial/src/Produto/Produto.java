package Produto;

public class Produto{
    private  int codigoUnico;
    private  String nomedoProduto;
    private  String categoria;
    private  int datadeFrabicacao;
    private  int datadeVencimento;
    private  int preco;

    public Produto(int codigoUnico, String nomedoProduto, String categoria, int datadeFrabicacao,
            int datadeVencimento, int preco) {
        this.codigoUnico = codigoUnico;
        this.nomedoProduto = nomedoProduto;
        this.categoria = categoria;
        this.datadeFrabicacao = datadeFrabicacao;
        this.datadeVencimento = datadeVencimento;
        this.preco = preco;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNomedoProduto() {
        return nomedoProduto;
    }

    public void setNomedoProduto(String nomedoProduto) {
        this.nomedoProduto = nomedoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDatadeFrabicacao() {
        return datadeFrabicacao;
    }

    public void setDatadeFrabicacao(int datadeFrabicacao) {
        this.datadeFrabicacao = datadeFrabicacao;
    }

    public int getDatadeVencimento() {
        return datadeVencimento;
    }

    public void setDatadeVencimento(int datadeVencimento) {
        this.datadeVencimento = datadeVencimento;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    //Métodos
    public void numeroCodigo (int codigoUnico){
        System.out.println("Id: " + codigoUnico);
    }
    public void novoProduto (String nomedoProduto){
        System.out.println("Nome do Produto: " + nomedoProduto);
    }



    public void detergente(String categoria) {
        System.out.println("Detergente");
    }
    public void sabao(String sabao) {
        System.out.println("Sabão em Pó");       
    }
    public void sabonete(String sabonete) {
        System.out.println("Sabonete");          
    }
    public void etc(String etc) {
        System.out.println("Etc");          
    }

}
