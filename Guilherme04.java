package ativadeslista2;

import java.util.Scanner;

/*Questão 4: Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
condições possíveis, conforme fluxograma abaixo.*/

public class Guilherme04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite o valor de a: ");
		int a = teclado.nextInt();
		System.out.println("Digite o valor de b: ");
		int b = teclado.nextInt();
		System.out.println("Digite o valor de c: ");
		int c = teclado.nextInt();
		teclado.close();
		double delta = Math.pow(b, 2)-4*a*c;
		if(a == 0) {
			System.out.println("Não é uma equação de segundo grau!");
			if (b == 0) {
				System.out.println("Não é uma equação do 1° grau!");
			}
			else {
				double r = -c/b;
				System.out.println("O valor de r é igual á: "+r);
			}
			
		}else if (delta < 0) { 
			System.out.println("Não existe raiz real para a equação!");
			
		}else if(delta == 0){
			double x1 = (-b+0)/2*a;
			System.out.println("As raizes da equação são iguais, e seu valor é: "+x1);
			
		}else if(delta > 0){
			double raizdelta = Math.sqrt(delta);
			double x1 = (-b+raizdelta)/(2*a);
			double x2 = (-b-raizdelta)/(2*a);
			System.out.println("x1 = soma com raiz de delta");
			System.out.println("x2 = subtração com raiz de delta");
			System.out.println("O delta é igual á: "+delta);
			System.out.printf("A raiz de delta é: %.2f",raizdelta);
			System.out.printf("%n A raiz x1 da equação de segundo grau é: x1= %.2f",x1);
			System.out.printf("%n A raiz x2 da equação de segundo grau é: x2= %.2f",x2);
		}
	}
}//Guilherme Henrique Batista de Matos;
