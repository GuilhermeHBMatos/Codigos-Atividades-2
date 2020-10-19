package ativadeslista2;

import java.util.Scanner;

/*Questão 05: O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
carro e mostre o custo ao consumido.*/

public class Guilherme05 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro: ");
		double custofab = teclado.nextDouble();
		teclado.close();
		if (custofab <= 28000.00) {
			double custototal = custofab+(custofab*0.05);
			System.out.printf("%n O custo total para o consumidor comprar o carro é de: R$%.2f",custototal);
		}
		else if (custofab > 45000.00) {
			double custototal = custofab+(custofab*0.15)+(custofab*0.20);
			System.out.printf("%n O custo total para o consumidor comprar o carro é de: R$%.2f",custototal);
		}
		else {
			double custototal = custofab+(custofab*0.10)+(custofab*0.15);
			System.out.printf("%n O custo total para o consumidor comprar o carro é de: R$%.2f",custototal);
		}
	}
}//Guilherme Henrique Batista de Matos;
