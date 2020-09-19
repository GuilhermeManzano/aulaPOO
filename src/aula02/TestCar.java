package aula02;

public class TestCar {
	public static void main(String[] args) {
		
		try {
			Car c1 = new Car("amarelo", "GM", "Camaro", 1992);
			System.out.println(c1.toString());

			Car c2 = new Car("verde", "VW", "Fusca", 1972);
			System.out.println(c2.toString());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Fim do programa");
		}
	}

}
