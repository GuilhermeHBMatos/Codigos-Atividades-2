package ativadeslista2;

import java.util.Scanner;

/*Questão 16:Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
pessoa. Utilizando as informações pesquisadas na questão anterior, verifique se essa pessoa não pode votar,
é obrigada a votar ou o voto e facultativo, segundo as regras brasileiras.*/

public class Guilherme16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anoAtual,dia,mes,ano,idade;
		System.out.println("Digite o ano de votação atual: ");
		anoAtual = teclado.nextInt();
		System.out.println("Digite a sua data de nascimento(dia,mês e ano consecutivamente): ");
		dia = teclado.nextInt();
		if (dia < 1 || dia > 31) {
			System.out.println("O dia é invalido!");
		}
		else {
			mes = teclado.nextInt();
		 if (mes < 1 || mes > 12) {
				System.out.println("O mês é invalido!");
			}
		 else {
				ano = teclado.nextInt();
		  if (ano < 1) {
					System.out.println("Ano inválido!");
				}
		 else {
			 System.out.println("A data de nascimento digitada é: "+dia+"/"+mes+"/"+ano);
			 idade = anoAtual - ano;
			 System.out.println("A sua idade ao final desse ano é de: "+idade+" anos!");
			 if (idade < 16) {
				 System.out.println("A pessoa não vota!");
			 }
			 else if ((idade >= 16 && idade <= 18) || (idade > 70)) {
				 System.out.println("O voto é facultativo!");
			 }
			 else {
				 System.out.println("O voto é obrigatório!");
			 }
		 }
	   }
	}teclado.close();
  }
}//Guilherme Henrique Batista de Matos;
