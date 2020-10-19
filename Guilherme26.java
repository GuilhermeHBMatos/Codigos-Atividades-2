package ativadeslista2;

import java.util.Scanner;

/*Questão 26: Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. O imposto,A gratificação,O salário líquido,A categoria.*/

public class Guilherme26 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o salário base do funcionário: ");
		double salbase = teclado.nextDouble();
		System.out.println("Digite o tempo de serviço do funcionário em anos: ");
		int temposerv = teclado.nextInt();
		teclado.close();
		double grati,imposto;
		//Imposto
		if (salbase < 200.00) {
			imposto = 0;
		}
		else if (salbase >= 200.00 && salbase <= 450.00) {
			imposto = salbase*0.03;
		}
		else if (salbase > 450.00 && salbase < 700.00) {
			imposto = salbase*0.08;
		}
		else {
			imposto = salbase*0.12;
		}
		//Gratificação
		if (salbase > 500) {
			if (temposerv <= 3) {
				grati = salbase*0.20;
			}
			else {
				grati = salbase*0.30;
			}
		}
		else {
			if (temposerv <= 3) {
				grati = salbase*0.23;
			}
			else if (temposerv > 3 && temposerv < 6) {
				grati = salbase*0.35;
			}
			else {
				grati = salbase*0.33;
			}
		}
		//Salário Líquido
		double salfinal = salbase-imposto+grati;
		//Categoria
		String categoria;
		if (salfinal <= 350.00) {
			categoria = "A";
		}
		else if (salfinal > 350 && salfinal < 600) {
			categoria = "B";
		}
		else {
			categoria = "C";
		}
		//Impressão
		System.out.printf("%nO Imposto a ser pago é de: R$%.2f",imposto);
		System.out.printf("%nA Gratificação a ser recebida é de: R$%.2f",grati);
		System.out.printf("%nO Salário Líquido a ser recebido é de: R$%.2f%n",salfinal);
		System.out.println("A Categoria do funcionário é: "+categoria);
	}

}//Guilherme Henrique Batista de Matos;
