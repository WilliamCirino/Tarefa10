package tarefa10;

//1) Apresentar os quadrados dos números inteiros de 15 a 200.
public class Exercicio01 {

	public static void main(String[] args) {
		for (int contador = 15; contador <= 200; contador++) {
			System.out.println(Math.pow(contador, 2));
		}
	}
}
