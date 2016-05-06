package Lista1Exercicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		// TODO Est�ncia a classe para receber dados do usu�rio
		Scanner digita = new Scanner(System.in);

		// TODO Est�ncia a cria��o do arquivo de cadastro
		FileWriter gravar = new FileWriter("CadastroGeral2.txt", true);
		PrintWriter grava = new PrintWriter(gravar);

		// TODO Inicio do la�o de cria��o do cadastro
		for (int cadastro = 1; cadastro <= 2; cadastro++) {

			// TODO Est�ncia os objetos aluno e nota
			CadastroAluno aluno = new CadastroAluno();
			CadastroNota nota = new CadastroNota();

			grava.print(cadastro + "\t");

			// TODO Solicita Cadastro do aluno

			System.out.print("\nInforme o nome do Aluno - " + cadastro + ": ");
			grava.print(aluno.nome = digita.next());
			grava.print("\t");

			System.out.print("Informe o endere�o do aluno: " + aluno.nome + ": ");
			grava.print(aluno.endere�o = digita.next());
			grava.print("\t");

			// TODO Solicita notas do aluno
			System.out.print("Informe a primeira nota do aluno " + aluno.nome + ": ");
			grava.print(nota.nota1 = digita.nextInt());
			grava.print("\t");

			System.out.print("Informe a segunda nota do aluno " + aluno.nome + ": ");
			grava.print(nota.nota2 = digita.nextInt());
			grava.print("\t");

			// TODO Calculo da media das notas
			nota.media = (nota.nota1 + nota.nota2) / 2;

			System.out.printf("\n => Aluno %s com m�dia: %d ", aluno.nome, nota.media);
			grava.print(nota.media);

			// TODO Avalia��o das notas
			if (nota.media < 60) {

				System.out.print(" (Reprovado)\n");
				grava.write("\tReprovado\n");

			} else {

				System.out.print(" (Aprovado)\n");
				grava.write("\tAprovado\n");
			}
			
			
		}
		

		// TODO Fecha arquivo
		gravar.close();
	
		System.out.println("\n+----------Rela��o de Cadastro:----------+ \n\n");
		
		// TODO leitura do arquivo de cadastro
		
		try (FileReader reader = new FileReader("CadastroGeral2.txt")) {
		    int character;
		 
		    while ((character = reader.read()) != -1) {
		        System.out.print((char) character);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
	
		System.out.println("\nFim do cadastro!!!\n");
	}

	
	
}
