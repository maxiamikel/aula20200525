package aula20200525;

public class Estado {
	private String nome;
	private String sigla;
	private int codigoDDI;

	public Estado(String nome, String sigla, int codigoDDI) {
		this.nome = nome;
		this.sigla = sigla;
		this.codigoDDI = codigoDDI;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public int getCodigoDDI() {
		return codigoDDI;
	}
}
