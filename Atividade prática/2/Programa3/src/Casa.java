package src;

public class Casa {
    // Atributos
    private String cor;
    private String porta1;
    private String porta2;
    private String porta3;
    private String casa;
    private boolean estado; // aberta // fechada

    public Casa(String cor, String porta1, String porta2, String porta3, String casa, boolean estado) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
        this.casa = casa;
        this.estado = estado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorta1() {
        return porta1;
    }

    public void setPorta1(String porta1) {
        this.porta1 = porta1;
    }

    public String getPorta2() {
        return porta2;
    }

    public void setPorta2(String porta2) {
        this.porta2 = porta2;
    }

    public String getPorta3() {
        return porta3;
    }

    public void setPorta3(String porta3) {
        this.porta3 = porta3;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Métodos
    public void porta() {
    }

    public void mudaEstado() {
        if (isEstado()) {
            this.setEstado(false);
        } else {
            this.setEstado(true);
        }
    }

    public String retonarEstado() {
        if (isEstado()) {
            return "Aberta";
        } else {
            return "Fechada";
        }
    }

    public Casa(int numeroDePortas) {

    }

    public void pinta(String s) {
        this.cor = s;

    }

    int quantasPortasEstaoAbertas() {
        return 0;

    }

}
