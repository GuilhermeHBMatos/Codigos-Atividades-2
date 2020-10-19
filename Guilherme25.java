package ativadeslista2;

import java.util.Scanner;

/*Questão 25:Faça um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -
Feminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:
 Homens: (72.7*altura) - 58                   Mulher: (62,1*altura) - 44.7*/

public class Guilherme25 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o sexo da pessoa: ");
		String sexo = teclado.next();
		System.out.println("Digite a altura da pessoa em metros: ");
		double altura = teclado.nextDouble();
		teclado.close();
		double pesoideal;
		if (sexo.equals("f") || sexo.equals("F") || sexo.equals("feminino") || sexo.equals("Feminino") || sexo.equals("mulher") || sexo.equals("Mulher")) {
			pesoideal = (62.1*altura) - 44.7;
			System.out.printf("O peso ideal para essa mulher de acordo as regras é em Kg: %.1f",pesoideal);
		}
		else if (sexo.equals("m") || sexo.equals("M") || sexo.equals("masculino") || sexo.equals("Masculino") || sexo.equals("homem") || sexo.equals("Homem")) {
			pesoideal = (72.7*altura) - 44.7;
			System.out.printf("O peso ideal para esse homem de acordo as regras é em Kg: %.1f",pesoideal);
		}
		else {
			System.out.println("Sexo Inválido!");
		}
	}

}//Guilherme Henrique Batista de Matos;
