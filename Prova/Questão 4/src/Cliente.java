public class Cliente {

	private Fisico baixaRenda;
	private Fisico integral;
	private Juridico industriaComecio;
	private Juridico servidorpublico;

    public Cliente(Fisico baixaRenda, Fisico integral, Juridico industriaComecio, Juridico servidorpublico) {
        this.baixaRenda = baixaRenda;
        this.integral = integral;
        this.industriaComecio = industriaComecio;
        this.servidorpublico = servidorpublico;
    }

    public Fisico getBaixaRenda() {
        return baixaRenda;
    }

    public void setBaixaRenda(Fisico baixaRenda) {
        this.baixaRenda = baixaRenda;
    }

    public Fisico getIntegral() {
        return integral;
    }

    public void setIntegral(Fisico integral) {
        this.integral = integral;
    }

    public Juridico getIndustriaComecio() {
        return industriaComecio;
    }

    public void setIndustriaComecio(Juridico industriaComecio) {
        this.industriaComecio = industriaComecio;
    }

    public Juridico getServidorpublico() {
        return servidorpublico;
    }

    public void setServidorpublico(Juridico servidorpublico) {
        this.servidorpublico = servidorpublico;
    }

    

    

}
