package src.model;

public class Pagamento extends Multa{ // classe Pagamento extends Multa

    // variáveis de instância
    private int id_pagamento;
    private int dinheiro;
    private int cartao;
    private int cheque;
    private int debito;
    private int pix;

    // construtor
    public Pagamento(int id_pagamento, int dinheiro, int cartao, int cheque, int debito, int pix) {
        this.id_pagamento = id_pagamento;
        this.dinheiro = dinheiro;
        this.cartao = cartao;
        this.cheque = cheque;
        this.debito = debito;
        this.pix = pix;
    }

    // chamando o método
    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public int getCheque() {
        return cheque;
    }

    public void setCheque(int cheque) {
        this.cheque = cheque;
    }

    public int getDebito() {
        return debito;
    }

    public void setDebito(int debito) {
        this.debito = debito;
    }

    public int getPix() {
        return pix;
    }

    public void setPix(int pix) {
        this.pix = pix;
    }

    

    
}
