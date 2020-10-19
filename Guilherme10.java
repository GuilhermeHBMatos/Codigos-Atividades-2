package ativadeslista2;

import java.util.Scanner;

/*Questão 10: Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem de determinado
medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve tomar
por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20
gotas.
- Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 quilos devem
tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.
- Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo conforme a
tabela a seguir:*/

public class Guilherme10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade do paciente: ");
		int idade = teclado.nextInt();
		System.out.println("Digite o peso do paciente: ");
		double peso = teclado.nextDouble();
		teclado.close();
		if (idade >= 12) {
			if (peso >= 60) {
				System.out.println("O paciente deve tomar 1000mg do remédio, ou seja 40 gotas!");
			}
			else {
				System.out.println("O paciente deve tomar 875mg do remédio, ou seja 35 gotas!");
			}
		}
		else {
			if ((peso >= 5) && (peso <= 9)) {
				System.out.println("O paciente deve tomar 125mg do remédio, ou seja 5 gotas!");
			}
			else if((peso >= 9.1) && (peso <= 16)) {
				System.out.println("O paciente deve tomar 250mg do remédio, ou seja 10 gotas!");
			}
			else if ((peso >= 16.1) && (peso <= 24)) {
				System.out.println("O paciente deve tomar 375mg do remédio, ou seja 15 gotas!");
			}
			else if((peso >= 24.1) && (peso <= 30)) {
				System.out.println("O paciente deve tomar 500mg do remédio, ou seja 20 gotas!");
			}
			else {
				System.out.println("O paciente deve tomar 750mg do remédio, ou seja 30 gotas!");
			}
		}
	}
}//Guilherme Henrique Batista de Matos;
