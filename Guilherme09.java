package ativadeslista2;

import java.util.Scanner;

/*Quest�o 09: Na cidade de Sabar�, para transfer�ncias de ve�culos, a SABATRAN cobra uma taxa de 1% para carros
fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa est�
incidindo sobre o valor de tabela do carro. Implemente um algoritmo que l� o ano de fabrica��o e o pre�o
do carro e a seguir calcula e imprime imposto a ser pago.*/

public class Guilherme09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o ano de fabrica��o do ve�culo: ");
		int anof = teclado.nextInt();
		System.out.println("Digite o pre�o do ve�culo: ");
		double pre�o = teclado.nextDouble();
		teclado.close();
		if (anof < 1990) {
			double imposto = (pre�o*0.01);
			System.out.printf("%n O imposto cobrado para transfer�ncia � de: R$%.2f",imposto);
		}
		else {
			double imposto = (pre�o*0.015);
			System.out.printf("%n O imposto cobrado para transfer�ncia � de: R$%.2f",imposto);
		}
	}
}//Guilherme Henrique Batista de Matos;
