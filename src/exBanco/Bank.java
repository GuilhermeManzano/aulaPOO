package exBanco;

public class Bank {
	private Integer numero;
	private Integer ag_numero;
	private String ag_nome;
	private Integer tipo;
	private Double saldo;
	
	public Bank(Integer numero, Integer ag_numero, String ag_nome, Integer tipo, Double saldo) {
		this.numero = numero;
		this.ag_numero = ag_numero;
		this.ag_nome = ag_nome;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public Bank(Integer numero, Integer ag_numero, String ag_nome, Integer tipo) {
		this.numero = numero;
		this.ag_numero = ag_numero;
		this.ag_nome = ag_nome;
		this.tipo = tipo;
		this.saldo = 0.0;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getAg_numero() {
		return ag_numero;
	}

	public String getAg_nome() {
		return ag_nome;
	}

	public void setAg_nome(String ag_nome) {
		this.ag_nome = ag_nome;
	}

	public Integer getTipo() {
		return tipo;
	}
	

	public Double getSaldo() {
		return saldo;
	}
	
	public void creditar(float saldo) {
		this.saldo += saldo;
	}
	
	public void debitar(float saldo) {
		this.saldo -= saldo;
	}
	
	public String consultarSaldo(Integer numero) {
		this.numero = numero;
		return "Conta " + numero + " com saldo de R$ " + saldo;
	}
	
	public Integer encerrarConta() {
		this.tipo = 4;
		return tipo;
	}
	
	public String textoEncerrar() {
		return "Conta " + numero + " do tipo " + tipo + " com saldo de R$ " + saldo +
				" foi encerrada com sucesso!";
	}
}
