package ativadeslista2;

import java.util.Scanner;

/*Quest�o 08: Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rio inferior � R$700,00 e 10% aos
funcion�rios com sal�rio superior ou igual � R$700,00. Fa�a um algoritmo que calcule o reajuste e mostre
o novo sal�rio.*/

public class Guilherme08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o sal�rio do funcion�rio: ");
		double sal = teclado.nextDouble();
		teclado.close();
		if (sal < 700.00) {
			double salFinal = sal+(sal*0.30);
			System.out.printf("%n O sal�rio reajustado do funcion�rio vai ser de: R$%.2f",salFinal);
		}
		else {
			double salFinal = sal+(sal*0.10);
			System.out.printf("%n O sal�rio reajustado do funcion�rio vai ser de: R$%.2f",salFinal);
		}
	}
}//Guilherme Henrique Batista de Matos;
