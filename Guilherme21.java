package ativadeslista2;

import java.util.Scanner;

/*Quest�o 21: Implemente um programa que receba um n�mero inteiro positivo representando um ano qualquer e
imprima se o ano � bissexto ou n�o. Um ano bissexto � definido quando: (ano % 4 = 0 e (ano % 100 != 0
ou ano % 400 == 0)).*/

public class Guilherme21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro positivo que represente um ano qualquer para saber se o mesmo � bissexto: ");
		int ano = teclado.nextInt();
		teclado.close();
		if ((ano%4 == 0 && (ano%100 != 0 || ano%400 == 0))) {
			System.out.println("O ano � bissexto!");
		}
		else {
			System.out.println("O ano n�o � bissexto!");
		}
	}

}//Guilherme Henrique Batista de Matos;
