package ativadeslista2;

import java.util.Scanner;

/*Quest�o 02: Fa�a um algoritmo que dado um n�mero digitado pelo usu�rio mostre se o mesmo � par ou �mpar.*/

public class Guilherme02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o n�mero que deseja descobrir se � par ou impar: ");
		int num = teclado.nextInt();
		teclado.close();
		if ((num%2) == 0) {
			System.out.println("O n�mero digitado � par!");
		}
		else {
			System.out.println("O n�mero digitado � impar!");
		}
	}
}//Guilherme Henrique Batista de Matos;
