package tarefa10;
/* 9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 
1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado 
o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8,
etc.*/
public class Exercicio09 {

	public static void main(String[] args) {
		int numero1 = 1, numero2 = 0;

		for (int contador = 0; contador < 16; contador++) {
			numero1 = numero1 + numero2;
			numero2 = numero1 - numero2;

			System.out.println(numero1);

		}
	}
}