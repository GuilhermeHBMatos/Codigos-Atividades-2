package ativadeslista2;

import java.util.Scanner;

/*Questão 03: Crie um programa que solicite a entrada de dois números, em seguida imprima na tela o quadrado do
menor e a raiz quadrada do maior número, caso os números sejam iguais mostre uma mensagem
informando que os números são iguais. Lembre-se de verificar as condições para um número possuir raiz
quadrada real.*/

public class Guilherme03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois números consecutivamente: ");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		teclado.close();
		if (num1 == num2) {
			System.out.println("Os dois números são iguais!");
		}
		else if(num1 < num2) {
			if (num2 < 0 || num2 == 0) {
				double newnum1 = Math.pow(num1, 2);
				System.out.println("O quadrado do menor número é: "+newnum1);
				System.out.println("Não possui raiz real para o maior número inserido ou raiz igual á zero!");
			}
			else {
				double newnum2 = Math.sqrt(num2);
				double newnum1 = Math.pow(num1, 2);
				System.out.println("O quadrado do menor número é: "+newnum1);
				System.out.println("A raiz do maior número é: "+newnum2);
			}
		}
		else {
			if (num1 < 0 || num1 == 0) {
				double newnum2 = Math.pow(num2, 2);
				System.out.println("O quadrado do menor número é: "+newnum2);
				System.out.println("Não possui raiz real para o maior número inserido ou raiz igual á zero!");
			}
			else {
				double newnum1 = Math.sqrt(num1);
				double newnum2 = Math.pow(num2, 2);
				System.out.println("O quadrado do menor número é: "+newnum2);
				System.out.println("A raiz do maior número é: "+newnum1);
			}
		}
	}
}//Guilherme Henrique Batista de Matos;
