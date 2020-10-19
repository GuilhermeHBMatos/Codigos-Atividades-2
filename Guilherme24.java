package ativadeslista2;

import java.util.Scanner;

/*Questão 24: Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O preço unitário do produto, segundo Tabela I
b) Preço total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Preço final ao consumidor após desconto
e) Não se esqueça de verificar a existência do produto*/

public class Guilherme24 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o código do produto: ");
		int codigo = teclado.nextInt();
		System.out.println("Digite a quantidade comprada do produto: ");
		int quantidade = teclado.nextInt();
		teclado.close();
		double preçounitario;
		if (codigo >= 1 && codigo <= 10) {
			preçounitario = 10;
		}
		else if (codigo >= 11 && codigo <= 20) {
			preçounitario = 20;
		}
		else if (codigo >= 21 && codigo <= 30) {
			preçounitario = 30;
		}
		else if (codigo >= 31 && codigo <= 40) {
			preçounitario = 40;
		}
		else {
			preçounitario = 0;
		}
		if (preçounitario == 0) {
			System.out.println("O código do produto é inexistente!");
		}
		else {
		//Preço total da compra
		double preçototalcompra = preçounitario*quantidade;
		//Desconto
		double desconto;
		if (preçototalcompra < 250) {
			desconto = 0.05;
		}
		else if (preçototalcompra >= 250 && preçototalcompra <= 500) {
			desconto = 0.10;
		}
		else {
			desconto = 0.15;
		}
		double descontoporc = (desconto*100);
		double preçofinal = preçototalcompra-(preçototalcompra*desconto);
		System.out.printf("O preço unitário do produto é de: R$%.2f",preçounitario);
		System.out.printf("%nO preço total da compra é de: R$%.2f%n",preçototalcompra);
		System.out.println("O valor do desconto é de: "+descontoporc+"%");
		System.out.printf("O preço final de compra é de: R$%.2f",preçofinal);
		}
	}

}//Guilherme Henrique Batista de Matos;
