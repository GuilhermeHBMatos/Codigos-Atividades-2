package ativadeslista2;

import java.util.Scanner;

/*Questão 21: Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
ou ano % 400 == 0)).*/

public class Guilherme21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo que represente um ano qualquer para saber se o mesmo é bissexto: ");
		int ano = teclado.nextInt();
		teclado.close();
		if ((ano%4 == 0 && (ano%100 != 0 || ano%400 == 0))) {
			System.out.println("O ano é bissexto!");
		}
		else {
			System.out.println("O ano não é bissexto!");
		}
	}

}//Guilherme Henrique Batista de Matos;
