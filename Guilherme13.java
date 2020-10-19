package ativadeslista2;

import java.util.Scanner;

/*Questão 13: O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma indicação
sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA2). Elabore um
algoritmo que leia o peso e a altura de um adulto e mostre sua condição.*/

public class Guilherme13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso da pessoa em Kg: ");
		double peso = teclado.nextDouble();
		System.out.println("Digite a altura da pessoa em Kg: ");
		double altura = teclado.nextDouble();
		teclado.close();
		double imc = peso/(Math.pow(altura, 2));
		if (imc < 18.5) {
			System.out.println("A pessoa está abaixo do peso!");
		}
		else if(imc >= 18.5 && imc <= 25) {
			System.out.println("A pessoa está com peso normal!");
		}
		else if(imc > 25 && imc <= 30) {
			System.out.println("A pessoa está acima do peso!");
		}
		else {
			System.out.println("A pessoa está obesa!");
		}
	}

}//Guilherme Henrique Batista de Matos;
