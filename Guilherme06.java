package ativadeslista2;

import java.util.Scanner;


/*Quest�o 06: Fa�a um programa que simule uma calculadora simples. Para isso, o usu�rio dever� entrar com dois
n�meros quaisquer e a opera��o que deseja realizar: '+' soma; ' - ' subtra��o; ' * ' multiplica��o e ' / '
divis�o. Lembre-se das condi��es para realizar a divis�o. Utilize a estrutura switch/case e apresente um
menu de op��es para o usu�rio.*/

public class Guilherme06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("soma (1) %nsubtra��o (2)%nmultiplica��o (3)%ndivis�o (4) %nDigite o n�mero equivalente � opera��o matem�tica que deseja realizar:");
		int op = teclado.nextInt();
		switch (op) {
		case 1:
			System.out.println("Digite os dois n�meros que deseja somar consecutivamente: ");
			double num1 = teclado.nextDouble();
			double num2 = teclado.nextDouble();
			double resultado = num1+num2;
			System.out.println("O resultado da soma �: "+resultado); break;
		case 2:
			System.out.println("Digite os dois n�meros que deseja subtrair consecutivamente: ");
			double num3 = teclado.nextDouble();
			double num4 = teclado.nextDouble();
			double resultado1 = num3-num4;
			System.out.println("O resultado da subtra��o �: "+resultado1); break;
		case 3:
			System.out.println("Digite os dois n�meros que deseja multiplicar consecutivamente: ");
			double num5 = teclado.nextDouble();
			double num6 = teclado.nextDouble();
			double resultado2 = num5*num6;
			System.out.println("O resultado da multiplica��o �: "+resultado2); break;
		case 4:
			System.out.println("Digite o denominador da divis�o: ");
			double num7 = teclado.nextDouble();
			if (num7 == 0) {
				System.out.println("Denominador � igual � zero!");break;
			}
			else {
			System.out.println("Digite o numerador da divis�o: ");
			double num8 = teclado.nextDouble();
			double resultado3 = num8/num7;
			System.out.printf("%nO resultado da divis�o �: %.2f",resultado3);break;
			}
		}teclado.close();
	}
}//Guilherme Henrique Batista de Matos
