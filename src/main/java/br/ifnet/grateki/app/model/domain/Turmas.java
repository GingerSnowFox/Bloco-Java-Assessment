package br.ifnet.grateki.app.model.domain;

public class Turmas {

	private String nomeAluno;
	private String professorResponsavel;
	private int codigoProf;
	private int codigoAluno;
	private Atividade atividade;
	
	public Turmas(String nomeAluno, String professorResponsavel,int codigoProf, int codigoAluno ) {
		this.nomeAluno = nomeAluno;
		this.professorResponsavel = professorResponsavel;
		this.codigoProf = codigoProf;
		this.codigoAluno = codigoAluno;
	}
	
	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nomeAluno);
		sb.append(";");
		sb.append(this.professorResponsavel);
		sb.append(";");
		sb.append(this.codigoProf);
		sb.append(";");
		sb.append(this.codigoAluno);
		sb.append(";");
		sb.append(this.atividade);
		
		return sb.toString();
		
		//return String.format("%s", this.nomeAluno, "%s", this.professorResponsavel, "%d", this.codigoProf, "%d", this.codigoAluno);
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
}
