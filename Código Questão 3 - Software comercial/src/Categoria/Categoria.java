package Categoria;

import Produto.Produto;

public class Categoria extends Produto{  

    private String detergente;
    private String sabao;
    private String sabonete;
    private String etc;   

    public Categoria(int codigoUnico, String nomedoProduto, String categoria, int datadeFrabicacao,
            int datadeVencimento, int preco, String detergente, String sabao, String sabonete, String etc) {
        super(codigoUnico, nomedoProduto, categoria, datadeFrabicacao, datadeVencimento, preco);
        this.detergente = detergente;
        this.sabao = sabao;
        this.sabonete = sabonete;
        this.etc = etc;
    }

    @Override
    public void detergente(String categoria) {
        super.detergente(categoria);
    }

    @Override
    public void etc(String etc) {       
        super.etc(etc);
    }

    @Override
    public void sabao(String sabao) {
        super.sabao(sabao);
    }

    @Override
    public void sabonete(String sabonete) {
        super.sabonete(sabonete);
    }


    public String getDetergente() {
        return detergente;
    }

    public void setDetergente(String detergente) {
        this.detergente = detergente;
    }

    public String getSabao() {
        return sabao;
    }

    public void setSabao(String sabao) {
        this.sabao = sabao;
    }

    public String getSabonete() {
        return sabonete;
    }

    public void setSabonete(String sabonete) {
        this.sabonete = sabonete;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    
}
