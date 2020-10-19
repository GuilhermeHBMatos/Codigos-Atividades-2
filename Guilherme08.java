package ativadeslista2;

import java.util.Scanner;

/*Questão 08: Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos
funcionários com salário superior ou igual à R$700,00. Faça um algoritmo que calcule o reajuste e mostre
o novo salário.*/

public class Guilherme08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salário do funcionário: ");
		double sal = teclado.nextDouble();
		teclado.close();
		if (sal < 700.00) {
			double salFinal = sal+(sal*0.30);
			System.out.printf("%n O salário reajustado do funcionário vai ser de: R$%.2f",salFinal);
		}
		else {
			double salFinal = sal+(sal*0.10);
			System.out.printf("%n O salário reajustado do funcionário vai ser de: R$%.2f",salFinal);
		}
	}
}//Guilherme Henrique Batista de Matos;
