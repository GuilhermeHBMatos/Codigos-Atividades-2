package ativadeslista2;

import java.util.Scanner;

/*Questão 22: Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.*/

public class Guilherme22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 números consecutivamente: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int num3 = teclado.nextInt();
		teclado.close();
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("Os números digitados em ordem decrescente são: "+num1+","+num2+","+num3+".");
			System.out.println("Os números digitados em ordem crescente são: "+num3+","+num2+","+num1+".");
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("Os números digitados em ordem decrescente são: "+num1+","+num3+","+num2+".");
			System.out.println("Os números digitados em ordem crescente são: "+num2+","+num3+","+num1+".");
		}
		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("Os números digitados em ordem decrescente são: "+num2+","+num1+","+num3+".");
			System.out.println("Os números digitados em ordem crescente são: "+num3+","+num1+","+num2+".");
		}
		else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("Os números digitados em ordem decrescente são: "+num2+","+num3+","+num1+".");
			System.out.println("Os números digitados em ordem crescente são: "+num1+","+num3+","+num2+".");
		}
		else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("Os números digitados em ordem decrescente são: "+num3+","+num1+","+num2+".");
			System.out.println("Os números digitados em ordem crescente são: "+num2+","+num1+","+num3+".");
		}
		else if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("Os números digitados em ordem decrescente são: "+num3+","+num2+","+num1+".");
			System.out.println("Os números digitados em ordem crescente são: "+num1+","+num2+","+num3+".");
		}
		else if (num1 == num2 && num2 > num3) {
			System.out.println("Os números digitados em ordem decrescente são: "+num1+","+num2+","+num3+".");
			System.out.println("Os números digitados em ordem crescente são: "+num3+","+num1+","+num2+".");
		}
		else if (num1 == num2 && num3 > num2) {
			System.out.println("Os números digitados em ordem decrescente são: "+num3+","+num2+","+num1+".");
			System.out.println("Os números digitados em ordem crescente são: "+num1+","+num2+","+num3+".");
		}
		else if (num2 == num3 && num1 > num2) {
			System.out.println("Os números digitados em ordem decrescente são: "+num1+","+num2+","+num3+".");
			System.out.println("Os números digitados em ordem crescente são: "+num3+","+num2+","+num1+".");
		}
		else if (num2 == num3 && num2 > num1) {
			System.out.println("Os números digitados em ordem decrescente são: "+num3+","+num2+","+num1+".");
			System.out.println("Os números digitados em ordem crescente são: "+num1+","+num2+","+num3+".");
		}
		else if (num3 == num1 && num1 > num2) {
			System.out.println("Os números digitados em ordem decrescente são: "+num3+","+num1+","+num2+".");
			System.out.println("Os números digitados em ordem crescente são: "+num2+","+num1+","+num3+".");
		}
		else if (num3 == num1 && num2 > num1) {
			System.out.println("Os números digitados em ordem decrescente são: "+num2+","+num1+","+num3+".");
			System.out.println("Os números digitados em ordem crescente são: "+num3+","+num1+","+num2+".");
		}
		else {
			System.out.println("Os números digitados são iguais!");
		}
	}

}//Guilherme Henrique Batista de Matos;
