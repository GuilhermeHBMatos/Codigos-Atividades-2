package ativadeslista2;

import java.util.Scanner;

/*Questão 15:Faça um algoritmo que receba duas datas (dia, mês e ano) e determine a maior entre elas. Você deverá
receber as datas no formato de uma String e fazer as devidas comparações. Pesquisem sobre as classes
Date e Calendar.*/


/*NOTA PARA O PROFESSOR: Sei que pediu para utilizar as classes Date e Calendar mas após pesquisar sobre as mesmas não consegui entender muito bem como funcionam
 * e resolvi fazer o código da forma padrão com o uso de condicionais! Eu consegui resolver o problema mas não da forma pedida.
 */

public class Guilherme15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia1,dia2,mes1,mes2,ano1,ano2;
		System.out.println("Digite o dia,mês e ano da primeira data consecutivamente: ");
		dia1 = teclado.nextInt();
		/*Condicional para determinar datas válidas!*/
		if (dia1 < 1 || dia1 > 31) {
			System.out.println("O dia é invalido!");
		}
		else {
			mes1 = teclado.nextInt();
		 if (mes1 < 1 || mes1 > 12) {
				System.out.println("O mês é invalido!");
			}
		 else {
				ano1 = teclado.nextInt();
		  if (ano1 < 1) {
					System.out.println("Ano inválido!");
				}
		  else {   /*Condicional para determinar a primeira data e pedir a segunda!*/
					System.out.println("A Primeira data digitada é: "+dia1+"/"+mes1+"/"+ano1);
					System.out.println("Digite o dia,mês e ano da segunda data consecutivamente: ");
					dia2 = teclado.nextInt();
					/*Condicional para determinar se a segunda data é válida!*/
			if (dia2 < 1 || dia2 > 31) {
						System.out.println("O dia é invalido!");
					}
			else {
						mes2 = teclado.nextInt();
				if (mes2 < 1 || mes2 > 12) {
							System.out.println("O mês é invalido!");
						}
				else {
							ano2 = teclado.nextInt();
					if (ano2 < 1) {
								System.out.println("Ano inválido!");
							}
					else {
								System.out.println("A Segunda data digitada é: "+dia2+"/"+mes2+"/"+ano2);
						/*Condicional para realizar a comparação das duas datas!*/
						if(ano1 == ano2) {
							if (mes1 == mes2) {
								if (dia1 == dia2) {
									System.out.println("As datas são Iguais!");
								}
								else if (dia1 > dia2) {
									System.out.println("A Primeira data é maior do que a Segunda!");
								}
								else {
									System.out.println("A Segunda data é maior do que a Primeira!");
								}
							}
							else if (mes1 > mes2) {
								System.out.println("A Primeira data é maior do que a Segunda!");
							}
							else {
								System.out.println("A Segunda data é maior do que a Primeira!");
							}
								}
						else if(ano1 > ano2) {
							System.out.println("A Primeira data é maior do que a Segunda!");
						}
						else {
							System.out.println("A Segunda data é maior do que a Primeira!");
						}
							}
						}
					}
				}
			}
		}teclado.close();
	}

}//Guilherme Henrique Batista de Matos;
