package br.ifnet.grateki.app.model.domain;

public class Planejamento {

	private String nomeTurma;
	private int codigoTurma;
	private int periodoTurma;

	public Planejamento(String nomeTurma, int codigoTurma, int periodoTurma) {
		this.nomeTurma = nomeTurma;
		this.codigoTurma = codigoTurma;
		this.periodoTurma = periodoTurma;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.nomeTurma);
		sb.append(";");
		sb.append(this.codigoTurma);
		sb.append(";");
		sb.append(this.periodoTurma);

		return sb.toString();
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	
	public int getPeriodoTurma() {
		return periodoTurma;
	}

	public void setPeriodoTurma(int periodoTurma) {
		this.periodoTurma = periodoTurma;
	}
}
