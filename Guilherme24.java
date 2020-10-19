package ativadeslista2;

import java.util.Scanner;

/*Quest�o 24: Fa�a um programa que recebe de entrada o c�digo de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O pre�o unit�rio do produto, segundo Tabela I
b) Pre�o total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Pre�o final ao consumidor ap�s desconto
e) N�o se esque�a de verificar a exist�ncia do produto*/

public class Guilherme24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o c�digo do produto: ");
		int codigo = teclado.nextInt();
		System.out.println("Digite a quantidade comprada do produto: ");
		int quantidade = teclado.nextInt();
		teclado.close();
		double pre�ounitario;
		if (codigo >= 1 && codigo <= 10) {
			pre�ounitario = 10;
		}
		else if (codigo >= 11 && codigo <= 20) {
			pre�ounitario = 20;
		}
		else if (codigo >= 21 && codigo <= 30) {
			pre�ounitario = 30;
		}
		else if (codigo >= 31 && codigo <= 40) {
			pre�ounitario = 40;
		}
		else {
			pre�ounitario = 0;
		}
		if (pre�ounitario == 0) {
			System.out.println("O c�digo do produto � inexistente!");
		}
		else {
		//Pre�o total da compra
		double pre�ototalcompra = pre�ounitario*quantidade;
		//Desconto
		double desconto;
		if (pre�ototalcompra < 250) {
			desconto = 0.05;
		}
		else if (pre�ototalcompra >= 250 && pre�ototalcompra <= 500) {
			desconto = 0.10;
		}
		else {
			desconto = 0.15;
		}
		double descontoporc = (desconto*100);
		double pre�ofinal = pre�ototalcompra-(pre�ototalcompra*desconto);
		System.out.printf("O pre�o unit�rio do produto � de: R$%.2f",pre�ounitario);
		System.out.printf("%nO pre�o total da compra � de: R$%.2f%n",pre�ototalcompra);
		System.out.println("O valor do desconto � de: "+descontoporc+"%");
		System.out.printf("O pre�o final de compra � de: R$%.2f",pre�ofinal);
		}
	}

}//Guilherme Henrique Batista de Matos;
