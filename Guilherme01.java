package ativadeslista2;

import java.util.Scanner;

/*Questão 01: Faça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.*/


public class Guilherme01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o número que deseja identificar como positivo,negativo ou zero: ");
		double num = teclado.nextDouble();
		teclado.close();
		if (num < 0) {
			System.out.println("O número digitado é negativo!");
		}
		else if (num == 0) {
			System.out.println("O número digitado é zero/nulo!");
		}
		else {
			System.out.println("O número digitado é positivo!");
		}
	}

}//Guilherme Henrique Batista de Matos;
