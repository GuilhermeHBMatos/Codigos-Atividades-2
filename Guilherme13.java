package ativadeslista2;

import java.util.Scanner;

/*Quest�o 13: O IMC (�ndice de Massa Corporal) � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o
sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = PESO/(ALTURA2). Elabore um
algoritmo que leia o peso e a altura de um adulto e mostre sua condi��o.*/

public class Guilherme13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso da pessoa em Kg: ");
		double peso = teclado.nextDouble();
		System.out.println("Digite a altura da pessoa em Kg: ");
		double altura = teclado.nextDouble();
		teclado.close();
		double imc = peso/(Math.pow(altura, 2));
		if (imc < 18.5) {
			System.out.println("A pessoa est� abaixo do peso!");
		}
		else if(imc >= 18.5 && imc <= 25) {
			System.out.println("A pessoa est� com peso normal!");
		}
		else if(imc > 25 && imc <= 30) {
			System.out.println("A pessoa est� acima do peso!");
		}
		else {
			System.out.println("A pessoa est� obesa!");
		}
	}

}//Guilherme Henrique Batista de Matos;
