package ativadeslista2;

import java.util.Scanner;

/*Quest�o 17: Fa�a um programa que receba de entrada tr�s valores. Verificar se esses valores podem formar um
tri�ngulo. Caso n�o, informar que n�o forma um tri�ngulo; caso sim, imprima que tipo de tri�ngulo pode
ser formado (escaleno, is�sceles ou equil�tero).*/

public class Guilherme17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os tr�s valores consecutivamente: ");
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		teclado.close();
		if (!(c < a+b && a-b < c &&
		    b < a+c && a-c < b &&
			a < b+c && b-c < a)
			) {
			System.out.println("N�o � poss�vel formar um tri�ngulo com esses valores!");
		}
		else {
			if (a != b && b != c && a != c) {
				System.out.println("O tri�ngulo � escaleno!");
			}
			else if ((a == b && a != c && b != c) || (a == c && a != b && b != c) || (b == c && b != a && a != c)) {
				System.out.println("O tri�ngulo � is�sceles!");
			}
			else if (a == b && a == c && b == c) {
				System.out.println("O tri�ngulo � equil�tero!");
			}
		}
	}
	
}//Guilherme Henrique Batista de Matos;
