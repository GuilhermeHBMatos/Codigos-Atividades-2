package ativadeslista2;

import java.util.Scanner;

/*Quest�o 18: Implemente um programa que receba um n�mero inteiro de 3 d�gitos de entrada. Ap�s isso, verifique se o
mesmo � pal�ndromo, ou seja, � o mesmo n�mero lido da direita para esquerda ou vice-versa. Ex.: 121,
353, etc. N�o � permitido a utiliza��o de fun��es prontas do JAVA, tal como o m�todo reverse.*/

public class Guilherme18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero de 3 Digitos para ser verificado se � um pal�ndromo: ");
		int num = teclado.nextInt();
		teclado.close();
		int unidade = num/100;
		if (num%10 == unidade) {
			System.out.println("O n�mero � pal�ndromo!");
		}
		else {
			System.out.println("O n�mero n�o � pal�ndromo!");
		}
	}

}//Guilherme Henrique Batista de Matos;
