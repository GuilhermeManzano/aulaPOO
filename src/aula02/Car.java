package aula02;

public class Car {
	private String cor;
	private String marca;
	private String modelo;
	private Integer ano;
	
	public Car(String cor, String marca, String modelo, Integer ano) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Car [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
}
