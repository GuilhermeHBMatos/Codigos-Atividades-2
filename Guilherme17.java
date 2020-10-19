package ativadeslista2;

import java.util.Scanner;

/*Questão 17: Faça um programa que receba de entrada três valores. Verificar se esses valores podem formar um
triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo pode
ser formado (escaleno, isósceles ou equilátero).*/

public class Guilherme17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os três valores consecutivamente: ");
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		teclado.close();
		if (!(c < a+b && a-b < c &&
		    b < a+c && a-c < b &&
			a < b+c && b-c < a)
			) {
			System.out.println("Não é possível formar um triângulo com esses valores!");
		}
		else {
			if (a != b && b != c && a != c) {
				System.out.println("O triângulo é escaleno!");
			}
			else if ((a == b && a != c && b != c) || (a == c && a != b && b != c) || (b == c && b != a && a != c)) {
				System.out.println("O triângulo é isósceles!");
			}
			else if (a == b && a == c && b == c) {
				System.out.println("O triângulo é equilátero!");
			}
		}
	}
	
}//Guilherme Henrique Batista de Matos;
