public class Minimo extends Cliente {

	private double valorMinimo;

	public Minimo(Fisico baixaRenda, Fisico integral, Juridico industriaComecio, Juridico servidorpublico,
			double valorMinimo) {
		super(baixaRenda, integral, industriaComecio, servidorpublico);
		this.valorMinimo = valorMinimo;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

}
