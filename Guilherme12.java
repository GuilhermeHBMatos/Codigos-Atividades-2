package ativadeslista2;

import java.util.Scanner;

/*Questão 12: Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
necessários em relação a idade inválida.*/

public class Guilherme12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade do nadador: ");
		int idade = teclado.nextInt();
		teclado.close();
		if ((idade >= 5) && (idade <= 7)) {
			System.out.println("O nadador é da categoria infantil!");
		}
		else if ((idade >= 8) && (idade <= 10)) {
			System.out.println("O nadador é da categoria juvenil!");
		}
		else if ((idade >= 11) && (idade <= 15)) {
			System.out.println("O nadador é da categoria Adolescente!");
		}
		else if ((idade >= 16) && (idade <= 40)) {
			System.out.println("O nadador é da categoria Adulto!");
		}
		else if (idade > 40) {
			System.out.println("O nadador é da categoria Sênior!");
		}
		else {
			System.out.println("Idade Inválida!");
		}
	}
}//GUilherme Henrique Batista de Matos;
