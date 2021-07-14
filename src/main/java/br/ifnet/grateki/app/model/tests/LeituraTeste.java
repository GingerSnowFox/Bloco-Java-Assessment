package br.ifnet.grateki.app.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraTeste {

	public static void main(String[] args) {

		try {
			String dir = "c:/dev/";
			String arq = "lista.txt";

			try {

				FileWriter fileW = new FileWriter(dir + "out_" + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);

				FileReader file = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(file);

				String linha = leitura.readLine();

				while (linha != null) {
					String[] campos = linha.split(";");

					if (campos.length == 3) {
						System.out.println("Lista de turmas e periodo");
					} else {

						switch (campos[0].toUpperCase()) {
						case "L":
							System.out.println("Atividades de leitura da turma");
							break;

						case "B":
							System.out.println("Atividades de Brincadeira da turma");
							break;

						case "A":
							System.out.println("Relação de lanche da turma");
							break;

						default:
							System.out.println("Entrada inválida");
							break;
						}
					}
					linha = leitura.readLine();
				}

				file.close();
				leitura.close();
				fileW.close();

			} catch (IOException e) {
				System.out.print(e.getMessage());
			}

		} finally {
			System.out.println("Finalizado");
		}
	}
}
