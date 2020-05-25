package aula20200525;

import java.util.ArrayList;

public class Pais {
	private String nome;
	private int codigoDDI;
	private Estado estado;
	private ArrayList<Estado> estados = new ArrayList<>();

	public Pais(String nome, int codigoDDI) {
		this.codigoDDI = codigoDDI;
		this.nome = nome;
		this.estado = estado;
		this.estados = estados;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoDDI() {
		return codigoDDI;
	}

	public void addEstado(Estado e) {
		this.estados.add(e);
	}

	public ArrayList<Estado> getEstado() {
		return estados;

	}

	public int contarEstado() {
		int numeroEstado = 0;
		for (int i = 0; i < estados.size(); i += 1) {
			numeroEstado += 1;
		}
		return numeroEstado;

	}

}
