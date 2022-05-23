package Status;

public class Status {
    private String bom;
    private String medio;
    private String ruim;

    public Status(String bom, String medio, String ruim) {
        this.bom = bom;
        this.medio = medio;
        this.ruim = ruim;
    }

    public String getBom() {
        return bom;
    }

    public void setBom(String bom) {
        this.bom = bom;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getRuim() {
        return ruim;
    }

    public void setRuim(String ruim) {
        this.ruim = ruim;
    }

    // Métodos
    public void numeroStatus(String bom) {
        System.out.println("Status:" + bom);
    }

}
