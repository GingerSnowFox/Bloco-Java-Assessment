package br.ifnet.grateki.app.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Atividade {

	private boolean presenca;
	private LocalDateTime diaAtividade;
	
	
public Atividade() {
	diaAtividade = LocalDateTime.now();
}
	public Atividade(boolean presenca, LocalDateTime diaAtividade) {
		this();
		this.presenca = presenca;
		

	}

	@Override

	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		StringBuilder sb = new StringBuilder();
		sb.append(this.presenca ? "P" : "A");
		sb.append(";");
		sb.append(this.diaAtividade.format(formato));

		return sb.toString();

	}

	public abstract String registraPresente();

	public abstract String registraProfessor();
	
	public abstract int tempoDuracao();

	public abstract int registraData();

	public boolean isPresenca() {
		return presenca;
	}

	public LocalDateTime getDiaAtividade() {
		return diaAtividade;
	}


	
}
