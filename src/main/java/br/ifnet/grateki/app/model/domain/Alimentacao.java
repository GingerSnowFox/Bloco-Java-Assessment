package br.ifnet.grateki.app.model.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Alimentacao extends Atividade {

	private int codigoLanche;

	public Alimentacao(boolean presenca, LocalDateTime diaAtividade) {
		super(presenca, diaAtividade);

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.codigoLanche);
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

	public String registraPresente() {

		return "José Silva, Maria Garcia, Antonio Pereira, Elberth";
	}

	public String registraProfessor() {

		return "Soraia Marques";
	}

	public int tempoDuracao() {

		return 20;
	}

	public int registraData() {

		return 24/7/2021;
	}

	public int getCodigoLanche() {
		return 2;
	}

	public void setCodigoLanche(int codigoLanche) {
		this.codigoLanche = codigoLanche;
	}

}
