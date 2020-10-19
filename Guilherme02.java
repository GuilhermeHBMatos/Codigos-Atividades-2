package ativadeslista2;

import java.util.Scanner;

/*Questão 02: Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.*/

public class Guilherme02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número que deseja descobrir se é par ou impar: ");
		int num = teclado.nextInt();
		teclado.close();
		if ((num%2) == 0) {
			System.out.println("O número digitado é par!");
		}
		else {
			System.out.println("O número digitado é impar!");
		}
	}
}//Guilherme Henrique Batista de Matos;
