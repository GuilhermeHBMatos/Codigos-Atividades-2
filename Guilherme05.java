package ativadeslista2;

import java.util.Scanner;

/*Quest�o 05: O custo de um carro novo ao consumidor � a soma do custo de f�brica, a porcentagem do distribuidor e os
impostos. O valor pago pela distribui��o e dos impostos � calculado com base no custo de f�brica. As
porcentagens est�o apresentadas na tabela abaixo. Fa�a um programa que receba o custo de f�brica de um
carro e mostre o custo ao consumido.*/

public class Guilherme05 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o custo de f�brica do carro: ");
		double custofab = teclado.nextDouble();
		teclado.close();
		if (custofab <= 28000.00) {
			double custototal = custofab+(custofab*0.05);
			System.out.printf("%n O custo total para o consumidor comprar o carro � de: R$%.2f",custototal);
		}
		else if (custofab > 45000.00) {
			double custototal = custofab+(custofab*0.15)+(custofab*0.20);
			System.out.printf("%n O custo total para o consumidor comprar o carro � de: R$%.2f",custototal);
		}
		else {
			double custototal = custofab+(custofab*0.10)+(custofab*0.15);
			System.out.printf("%n O custo total para o consumidor comprar o carro � de: R$%.2f",custototal);
		}
	}
}//Guilherme Henrique Batista de Matos;
