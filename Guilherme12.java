package ativadeslista2;

import java.util.Scanner;

/*Quest�o 12: Fa�a um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Fa�a os testes
necess�rios em rela��o a idade inv�lida.*/

public class Guilherme12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade do nadador: ");
		int idade = teclado.nextInt();
		teclado.close();
		if ((idade >= 5) && (idade <= 7)) {
			System.out.println("O nadador � da categoria infantil!");
		}
		else if ((idade >= 8) && (idade <= 10)) {
			System.out.println("O nadador � da categoria juvenil!");
		}
		else if ((idade >= 11) && (idade <= 15)) {
			System.out.println("O nadador � da categoria Adolescente!");
		}
		else if ((idade >= 16) && (idade <= 40)) {
			System.out.println("O nadador � da categoria Adulto!");
		}
		else if (idade > 40) {
			System.out.println("O nadador � da categoria S�nior!");
		}
		else {
			System.out.println("Idade Inv�lida!");
		}
	}
}//GUilherme Henrique Batista de Matos;
