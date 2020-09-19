package aula03;

import java.util.Scanner;

import exAnimal.Animais;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {			
			System.out.print("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.print("Digite a matr�cula do aluno: ");
			String matricula = sc.nextLine();
			System.out.print("Digite a primeira nota do aluno: ");
			double nota1 = sc.nextDouble();
			System.out.print("Digite a segunda nota do aluno: ");
			double nota2 = sc.nextDouble();
			
			Aluno a1 = new Aluno(nome, matricula, nota1, nota2);
			a1.toString();
			
			if(a1.calcularMedia() >= 6) {
				System.out.println("Voc� foi aprovado!\nA sua m�dia � de " + a1.calcularMedia());
			} else {
				System.out.println("M�dia insuficiente!\nA sua m�dia � de " + a1.calcularMedia());
				System.out.println("Digite a nota da reavalia��o: ");
				double notaReavaliacao = sc.nextDouble();
				a1.setNotaReavaliacao(notaReavaliacao);
				
				double final1 = a1.calcularMediaFinal(notaReavaliacao);
				if(final1 >= 6) {
					System.out.println("Voc� foi aprovado!\nA sua m�dia � de " + final1);
				} else {
					System.out.println("Voc� foi reprovado!\nA sua m�dia � de " + final1);
				}
			}										
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Fim do programa");
			sc.close();
		}		
	}
}