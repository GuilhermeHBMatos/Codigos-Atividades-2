package ativadeslista2;

import java.util.Scanner;

/*Quest�o 22: Fa�a um algoritmo que receba tr�s n�meros e mostre-os em ordem crescente e decrescente.*/

public class Guilherme22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 n�meros consecutivamente: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int num3 = teclado.nextInt();
		teclado.close();
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num1+","+num2+","+num3+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+","+num2+","+num1+".");
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num1+","+num3+","+num2+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num2+","+num3+","+num1+".");
		}
		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num2+","+num1+","+num3+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+","+num1+","+num2+".");
		}
		else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num2+","+num3+","+num1+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num1+","+num3+","+num2+".");
		}
		else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num3+","+num1+","+num2+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num2+","+num1+","+num3+".");
		}
		else if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num3+","+num2+","+num1+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num1+","+num2+","+num3+".");
		}
		else if (num1 == num2 && num2 > num3) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num1+","+num2+","+num3+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+","+num1+","+num2+".");
		}
		else if (num1 == num2 && num3 > num2) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num3+","+num2+","+num1+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num1+","+num2+","+num3+".");
		}
		else if (num2 == num3 && num1 > num2) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num1+","+num2+","+num3+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+","+num2+","+num1+".");
		}
		else if (num2 == num3 && num2 > num1) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num3+","+num2+","+num1+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num1+","+num2+","+num3+".");
		}
		else if (num3 == num1 && num1 > num2) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num3+","+num1+","+num2+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num2+","+num1+","+num3+".");
		}
		else if (num3 == num1 && num2 > num1) {
			System.out.println("Os n�meros digitados em ordem decrescente s�o: "+num2+","+num1+","+num3+".");
			System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+","+num1+","+num2+".");
		}
		else {
			System.out.println("Os n�meros digitados s�o iguais!");
		}
	}

}//Guilherme Henrique Batista de Matos;
