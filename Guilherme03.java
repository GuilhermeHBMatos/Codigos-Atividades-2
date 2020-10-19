package ativadeslista2;

import java.util.Scanner;

/*Quest�o 03: Crie um programa que solicite a entrada de dois n�meros, em seguida imprima na tela o quadrado do
menor e a raiz quadrada do maior n�mero, caso os n�meros sejam iguais mostre uma mensagem
informando que os n�meros s�o iguais. Lembre-se de verificar as condi��es para um n�mero possuir raiz
quadrada real.*/

public class Guilherme03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois n�meros consecutivamente: ");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		teclado.close();
		if (num1 == num2) {
			System.out.println("Os dois n�meros s�o iguais!");
		}
		else if(num1 < num2) {
			if (num2 < 0 || num2 == 0) {
				double newnum1 = Math.pow(num1, 2);
				System.out.println("O quadrado do menor n�mero �: "+newnum1);
				System.out.println("N�o possui raiz real para o maior n�mero inserido ou raiz igual � zero!");
			}
			else {
				double newnum2 = Math.sqrt(num2);
				double newnum1 = Math.pow(num1, 2);
				System.out.println("O quadrado do menor n�mero �: "+newnum1);
				System.out.println("A raiz do maior n�mero �: "+newnum2);
			}
		}
		else {
			if (num1 < 0 || num1 == 0) {
				double newnum2 = Math.pow(num2, 2);
				System.out.println("O quadrado do menor n�mero �: "+newnum2);
				System.out.println("N�o possui raiz real para o maior n�mero inserido ou raiz igual � zero!");
			}
			else {
				double newnum1 = Math.sqrt(num1);
				double newnum2 = Math.pow(num2, 2);
				System.out.println("O quadrado do menor n�mero �: "+newnum2);
				System.out.println("A raiz do maior n�mero �: "+newnum1);
			}
		}
	}
}//Guilherme Henrique Batista de Matos;
