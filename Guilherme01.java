package ativadeslista2;

import java.util.Scanner;

/*Quest�o 01: Fa�a um programa que identifique se um n�mero digitado pelo usu�rio � positivo, negativo ou zero.*/


public class Guilherme01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o n�mero que deseja identificar como positivo,negativo ou zero: ");
		double num = teclado.nextDouble();
		teclado.close();
		if (num < 0) {
			System.out.println("O n�mero digitado � negativo!");
		}
		else if (num == 0) {
			System.out.println("O n�mero digitado � zero/nulo!");
		}
		else {
			System.out.println("O n�mero digitado � positivo!");
		}
	}

}//Guilherme Henrique Batista de Matos;
