package appDespesas;

import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
// Atributos
	private String cpf;
	ArrayList<Despesa> despesas = new ArrayList<Despesa>();

// Construtor
	public DespesaPessoal(String cpf) {
		this.cpf = cpf;
	}

	// Total geral de despesas
	public double getTotal() {
		double total = 0;
		for (Despesa desp : despesas) {
			total += desp.getValor();
		}
		return total;
	}

	public double getTotal(int mes, int ano) {
		return 0;
	}

	public double getTotal(LocalDate data) {
		return 0;
	}

	public void imprime() {
		String space = " ";
		System.out.println("-------------------------------------------------------------------");
		System.out.println("CPF: " + this.getCpf());
		System.out.println("-------------------------------------------------------------------");
		for (Despesa desp : despesas) {
			System.out.println((desp.getDescDespesa() + space).substring(0, Math.min(despesas.size(), 1)) + "\t\t\t" + desp.getData() + "\t\t"
					+ desp.getValor());
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println(space + "\t\t\t\t" + this.getTotal());
	}

	public void imprime(int mes, int ano) {
	}

	public void imprime(LocalDate data) {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "DespesaPessoal [CPF= " + cpf + ", Despesas=" + despesas + "]";
	}
}
