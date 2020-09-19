package exAnimal;

public class Animais {
	private String nome;
	private String classe;
	private String familia;
	private Integer idade;
	private Boolean estado;
	private Integer caloria;
	private Integer forca;
	
	public Animais(String nome, String classe, String familia, Integer idade, Boolean estado, Integer caloria,
			Integer forca) {
		this.nome = nome;
		this.classe = classe;
		this.familia = familia;
		this.idade = idade;
		this.estado = estado;
		this.caloria = caloria;
		this.forca = forca;
	}
	
	public Animais(String nome, String classe, String familia) {
		this.nome = nome;
		this.classe = classe;
		this.familia = familia;
		this.forca = 10;
		this.caloria = 10;
		this.idade = 0;
		this.estado = true;
	}
	
	public String getNome() {
		return nome;
	}

	public String getClasse() {
		return classe;
	}

	public String getFamilia() {
		return familia;
	}

	public Integer getIdade() {
		return idade;
	}

	public Boolean getEstado() {
		return estado;
	}

	public Integer getCaloria() {
		return caloria;
	}

	public Integer getForca() {
		return forca;
	}
	
	public String nasceu() {
		return "O animal se chama " + nome + " é da classe " + classe + " da familia " + 
		familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +
		idade;
	}
	
	public String morrer() {
		this.forca = 0;
		this.estado = false;
		
		return "O animal morreu!";
	}
	
	public String comer() {
		this.caloria += 10;
		this.forca -= 2;
		
		return "O animal comeu e agora sua força é de " + forca + 
				" e suas calorias valem " + caloria;
	}
	
	public String correr() {
		this.forca -= 5;
		this.caloria -= 5;
		
		return "O animal está correndo!! Agora sua força é de " +
		forca + " e suas calorias valem " + caloria;
	}
	
	public String dormir() {
		this.forca += 10;
		this.caloria -= 2;
		
		return "O animal está domingo agora! Sua força aumentou para "
				+ forca + " e suas calorias aumentaram para " + caloria;
	}
}
