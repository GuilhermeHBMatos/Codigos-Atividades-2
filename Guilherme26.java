package ativadeslista2;

import java.util.Scanner;

/*Quest�o 26: Fa�a um algoritmo que receba o sal�rio base e o tempo de servi�o de um funcion�rio. O imposto,A gratifica��o,O sal�rio l�quido,A categoria.*/

public class Guilherme26 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o sal�rio base do funcion�rio: ");
		double salbase = teclado.nextDouble();
		System.out.println("Digite o tempo de servi�o do funcion�rio em anos: ");
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
		//Gratifica��o
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
		//Sal�rio L�quido
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
		//Impress�o
		System.out.printf("%nO Imposto a ser pago � de: R$%.2f",imposto);
		System.out.printf("%nA Gratifica��o a ser recebida � de: R$%.2f",grati);
		System.out.printf("%nO Sal�rio L�quido a ser recebido � de: R$%.2f%n",salfinal);
		System.out.println("A Categoria do funcion�rio �: "+categoria);
	}

}//Guilherme Henrique Batista de Matos;
