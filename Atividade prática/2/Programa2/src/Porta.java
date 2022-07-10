public class Porta {
    private boolean estado; // aberta // fechada
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double intdimensaoZ;

    // Métodos
    public Porta(boolean estado, String cor, double dimensaoX, double dimensaoY, double intdimensaoZ) {
        this.estado = estado;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.intdimensaoZ = intdimensaoZ;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getIntdimensaoZ() {
        return intdimensaoZ;
    }

    public void setIntdimensaoZ(double intdimensaoZ) {
        this.intdimensaoZ = intdimensaoZ;
    }

// Métodos
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

}
