package ativadeslista2;

import java.util.Scanner;

/*Questão 20: Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A função mod utilizada
no fluxograma representa o resto da divisão interia.*/

public class Guilherme20 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois números consecutivamente(N1,N2) para saber se o primeiro é multiplo do segundo: ");
		int N1 = teclado.nextInt();
		int N2 = teclado.nextInt();
		teclado.close();
		int resto = N1%N2;
		if (resto == 0) {
			System.out.println("N1 é multiplo de N2!");
		}
		else {
			System.out.println("N1 não é multiplo de N2!");
		}
	}

}//Guilherme Henrique Batista de Matos;
