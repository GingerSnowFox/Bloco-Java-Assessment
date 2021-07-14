package br.ifnet.grateki.app.model.tests;

import br.ifnet.grateki.app.model.domain.Planejamento;

public class PlanejamentoTeste {

	public static void main(String[] args) {
		
		Planejamento p1 = new Planejamento("primario", 131, 1);
		System.out.println("Planejamento:" + p1);
	}
}
