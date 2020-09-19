package exBanco;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Integer op = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			Bank c1 = new Bank(1, 100, "Sede", 1);
			
			while (op != 5) {
				System.out.println("\nBem vindo ao nosso banco!\nQual operação deseja realizar hoje?\n"
						+ " 1 - creditar\n 2 - debitar\n 3 - consultar saldo\n 4 - encerrar conta \n"
						+ " 5 - sair");
				op = sc.nextInt();
				
				switch(op) {
					case 1:
						if (c1.getTipo() != 4) {
							System.out.println("Digite o valor a ser creditado: ");
							c1.creditar(sc.nextInt());
							System.out.println("\nSeu saldo atual é de " + c1.getSaldo());
						} else {
							System.out.println("Conta encerrada! Não é possivel realizar esta operação");
						}
						
						break;
					case 2:
						if (c1.getTipo() != 4) {
							System.out.println("Digite o valor a ser debitado: ");
							c1.debitar(sc.nextInt());
							System.out.println("\nSeu saldo atual é de " + c1.getSaldo());
						} else {
							System.out.println("Conta encerrada! Não é possivel realizar esta operação");
						}
						break;
					case 3:
						System.out.println("Seu saldo atual é de " + c1.getSaldo());
						break;
					case 4:
						if (c1.getSaldo() <= 0) {
							c1.encerrarConta();
							System.out.println(c1.textoEncerrar());
						} else {
							System.out.println("Não é possivel encerrar a conta, retire todo o dinheiro");
						}
						break;
					case 5:
						System.out.println("\nVolte sempre!");
						break;
				}
			}
						
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Fim do programa");
			sc.close();
		}		
	}

}
