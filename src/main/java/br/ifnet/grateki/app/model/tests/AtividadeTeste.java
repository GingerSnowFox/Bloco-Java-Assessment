package br.ifnet.grateki.app.model.tests;

import java.util.Date;

import br.ifnet.grateki.app.model.domain.Alimentacao;
import br.ifnet.grateki.app.model.domain.Brincadeira;
import br.ifnet.grateki.app.model.domain.Conteudo;

public class AtividadeTeste {

	public static void main(String[] args) {

		Conteudo c1 = new Conteudo(true, null); // Perguntar para o professor como preencher o teste com data.
		c1.setLeitura("Alice no pais das maravilhas");
		c1.setQuestionario("Questionário sobre livro");

		System.out.println("Leitura: " + c1);

		Brincadeira b1 = new Brincadeira(true, null); 
		b1.setCodigoBrincadeira(5);

		System.out.println("Brincadeira: " + b1);
		
		
		Alimentacao al1 = new Alimentacao(true, null);
		al1.setCodigoLanche(4);
		
		System.out.println("Lanche: " + al1);
		
	}

}
