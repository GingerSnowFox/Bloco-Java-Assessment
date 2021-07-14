package br.ifnet.grateki.app.model.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Conteudo extends Atividade {
	
	private String leitura;
	private String questionario;

	public Conteudo(boolean presenca, LocalDateTime diaAtividade) {
		super(presenca, diaAtividade);

	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.leitura);
		sb.append(";");
		sb.append(this.questionario);
		sb.append(";");
		sb.append(this.registraPresente());
		sb.append(";");
		sb.append(this.registraProfessor());
		sb.append(";");
		sb.append(this.registraData());
		sb.append(";");
		sb.append(this.tempoDuracao());
		
		
		return sb.toString();
	}

	@Override
	public String registraPresente() {

		return "José Silva, Maria Garcia, Antonio Pereira, Elberth";
	}

	@Override
	public String registraProfessor() {

		return "Ana Oliveira";
	}

	@Override
	public int registraData() {

		return 21/05/2021;
	}

	@Override
	public int tempoDuracao() {

		return 25;
	}

	public String getLeitura() {
		return leitura;
	}

	public void setLeitura(String leitura) {
		this.leitura = leitura;
	}

	public String getQuestionario() {
		return questionario;
	}

	public void setQuestionario(String questionario) {
		this.questionario = questionario;
	}

}
