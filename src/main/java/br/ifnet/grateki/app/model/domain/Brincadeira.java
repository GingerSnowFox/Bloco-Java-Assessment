package br.ifnet.grateki.app.model.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Brincadeira extends Atividade {

	private int codigoBrincadeira;

	public Brincadeira(boolean presenca, LocalDateTime diaAtividade) {
		super(presenca, diaAtividade);

	}

	public String toString() {

		

		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append(";");
		sb.append(this.codigoBrincadeira);
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

		return "Julia Souza";
	}

	@Override
	public int tempoDuracao() {

		return 50;
	}

	@Override
	public int registraData() {

		return 25 / 7 / 2021;
	}

	public int getCodigoBrincadeira() {
		return codigoBrincadeira;
	}

	public void setCodigoBrincadeira(int codigoBrincadeira) {
		this.codigoBrincadeira = codigoBrincadeira;
	}

}
