package ativadeslista2;

import java.util.Scanner;

/*Quest�o 20: Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A fun��o mod utilizada
no fluxograma representa o resto da divis�o interia.*/

public class Guilherme20 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois n�meros consecutivamente(N1,N2) para saber se o primeiro � multiplo do segundo: ");
		int N1 = teclado.nextInt();
		int N2 = teclado.nextInt();
		teclado.close();
		int resto = N1%N2;
		if (resto == 0) {
			System.out.println("N1 � multiplo de N2!");
		}
		else {
			System.out.println("N1 n�o � multiplo de N2!");
		}
	}

}//Guilherme Henrique Batista de Matos;
