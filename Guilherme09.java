package ativadeslista2;

import java.util.Scanner;

/*Questão 09: Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
do carro e a seguir calcula e imprime imposto a ser pago.*/

public class Guilherme09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o ano de fabricação do veículo: ");
		int anof = teclado.nextInt();
		System.out.println("Digite o preço do veículo: ");
		double preço = teclado.nextDouble();
		teclado.close();
		if (anof < 1990) {
			double imposto = (preço*0.01);
			System.out.printf("%n O imposto cobrado para transferência é de: R$%.2f",imposto);
		}
		else {
			double imposto = (preço*0.015);
			System.out.printf("%n O imposto cobrado para transferência é de: R$%.2f",imposto);
		}
	}
}//Guilherme Henrique Batista de Matos;
