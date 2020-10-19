package ativadeslista2;

import java.util.Scanner;

/*Questão 18: Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
353, etc. Não é permitido a utilização de funções prontas do JAVA, tal como o método reverse.*/

public class Guilherme18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número de 3 Digitos para ser verificado se é um palíndromo: ");
		int num = teclado.nextInt();
		teclado.close();
		int unidade = num/100;
		if (num%10 == unidade) {
			System.out.println("O número é palíndromo!");
		}
		else {
			System.out.println("O número não é palíndromo!");
		}
	}

}//Guilherme Henrique Batista de Matos;
