package ativadeslista2;

import java.util.Scanner;


/*Questão 06: Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
divisão. Lembre-se das condições para realizar a divisão. Utilize a estrutura switch/case e apresente um
menu de opções para o usuário.*/

public class Guilherme06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("soma (1) %nsubtração (2)%nmultiplicação (3)%ndivisão (4) %nDigite o número equivalente á operação matemática que deseja realizar:");
		int op = teclado.nextInt();
		switch (op) {
		case 1:
			System.out.println("Digite os dois números que deseja somar consecutivamente: ");
			double num1 = teclado.nextDouble();
			double num2 = teclado.nextDouble();
			double resultado = num1+num2;
			System.out.println("O resultado da soma é: "+resultado); break;
		case 2:
			System.out.println("Digite os dois números que deseja subtrair consecutivamente: ");
			double num3 = teclado.nextDouble();
			double num4 = teclado.nextDouble();
			double resultado1 = num3-num4;
			System.out.println("O resultado da subtração é: "+resultado1); break;
		case 3:
			System.out.println("Digite os dois números que deseja multiplicar consecutivamente: ");
			double num5 = teclado.nextDouble();
			double num6 = teclado.nextDouble();
			double resultado2 = num5*num6;
			System.out.println("O resultado da multiplicação é: "+resultado2); break;
		case 4:
			System.out.println("Digite o denominador da divisão: ");
			double num7 = teclado.nextDouble();
			if (num7 == 0) {
				System.out.println("Denominador é igual á zero!");break;
			}
			else {
			System.out.println("Digite o numerador da divisão: ");
			double num8 = teclado.nextDouble();
			double resultado3 = num8/num7;
			System.out.printf("%nO resultado da divisão é: %.2f",resultado3);break;
			}
		}teclado.close();
	}
}//Guilherme Henrique Batista de Matos
