package aula01;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		System.out.print("Entre com seu nome: ");
		String nome = meuScanner.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.print("Entre com a Nota 1: ");
		float nota1 = meuScanner.nextFloat();
		System.out.print("Entre com a Nota 2: ");
		float nota2 = meuScanner.nextFloat();
		System.out.println("Média: : " + ((nota1+nota2)/2));
	}
}
