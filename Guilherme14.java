package ativadeslista2;

import java.util.Scanner;

/*Quest�o 14: Elabore um programa que calcule e exiba a tens�o S de uma barra cil�ndrica de di�metro D submetida a
uma carga Q. Os valores de D e Q devem ser fornecidos pelo usu�rio do programa via teclado. Utilize a
f�rmula: S= (4*Q/pi*D�)*n       onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.*/

public class Guilherme14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do di�metro(D) da barra cil�ndrica: ");
		double D = teclado.nextDouble();
		System.out.println("Digite o valor da carga(Q) submetica sobre a barra: ");
		double Q = teclado.nextDouble();
		double pi = Math.PI;
		teclado.close();
		if (D > 100) {
			int n = 2;
			double S = (4*Q/pi*(Math.pow(D, 2)))*n;
			System.out.printf("%nA tens�o da barra cil�ndrica � de: %.2f",S);
		}
		else if (D < 50) {
			int n = 6;
			double S = (4*Q/pi*(Math.pow(D, 2)))*n;
			System.out.printf("%nA tens�o da barra cil�ndrica � de: %.2f",S);
		}
		else {
			int n = 4;
			double S = (4*Q/pi*(Math.pow(D, 2)))*n;
			System.out.printf("%nA tens�o da barra cil�ndrica � de: %.2f",S);
		}
	}

}//Guilherme Henrique Batista de Matos;
