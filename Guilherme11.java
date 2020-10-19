package ativadeslista2;

import java.util.Scanner;

/*Questão 11: Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).*/

public class Guilherme11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de x: ");
		double x = teclado.nextDouble();
		teclado.close();
		if (x <= 1) {
			System.out.println("f(x)= 1");
		}
		else if(x <= 2) {
			System.out.println("f(x)= 2");
		}
		else if(x <= 3) {
			double x2 = Math.pow(x, 2);
			System.out.println("f(x)= "+x2);
		}
		else {
			double x3 = Math.pow(x, 3);
			System.out.println("f(x)= "+x3);
		}
	}
}//Guilherme Henrique Batista de Matos;
