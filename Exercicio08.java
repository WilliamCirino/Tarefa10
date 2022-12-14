package tarefa10;

import java.util.Scanner;

/* 8) Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, de BE,
em que B é o valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).
*/
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da base");
		double base = sc.nextDouble();

		System.out.println("Digite o número do expoente");
		double expoente = sc.nextDouble();

		double potencia = Math.pow(base, expoente);

		System.out.println("A potência resulta em: " + potencia);
		sc.close();
	}
}