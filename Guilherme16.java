package ativadeslista2;

import java.util.Scanner;

/*Quest�o 16:Fa�a um programa que receba de entrada a data de vota��o do ano atual e a data de nascimento de uma
pessoa. Utilizando as informa��es pesquisadas na quest�o anterior, verifique se essa pessoa n�o pode votar,
� obrigada a votar ou o voto e facultativo, segundo as regras brasileiras.*/

public class Guilherme16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anoAtual,dia,mes,ano,idade;
		System.out.println("Digite o ano de vota��o atual: ");
		anoAtual = teclado.nextInt();
		System.out.println("Digite a sua data de nascimento(dia,m�s e ano consecutivamente): ");
		dia = teclado.nextInt();
		if (dia < 1 || dia > 31) {
			System.out.println("O dia � invalido!");
		}
		else {
			mes = teclado.nextInt();
		 if (mes < 1 || mes > 12) {
				System.out.println("O m�s � invalido!");
			}
		 else {
				ano = teclado.nextInt();
		  if (ano < 1) {
					System.out.println("Ano inv�lido!");
				}
		 else {
			 System.out.println("A data de nascimento digitada �: "+dia+"/"+mes+"/"+ano);
			 idade = anoAtual - ano;
			 System.out.println("A sua idade ao final desse ano � de: "+idade+" anos!");
			 if (idade < 16) {
				 System.out.println("A pessoa n�o vota!");
			 }
			 else if ((idade >= 16 && idade <= 18) || (idade > 70)) {
				 System.out.println("O voto � facultativo!");
			 }
			 else {
				 System.out.println("O voto � obrigat�rio!");
			 }
		 }
	   }
	}teclado.close();
  }
}//Guilherme Henrique Batista de Matos;
