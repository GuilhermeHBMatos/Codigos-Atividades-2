package ativadeslista2;

import java.util.Scanner;

/*Quest�o 15:Fa�a um algoritmo que receba duas datas (dia, m�s e ano) e determine a maior entre elas. Voc� dever�
receber as datas no formato de uma String e fazer as devidas compara��es. Pesquisem sobre as classes
Date e Calendar.*/


/*NOTA PARA O PROFESSOR: Sei que pediu para utilizar as classes Date e Calendar mas ap�s pesquisar sobre as mesmas n�o consegui entender muito bem como funcionam
 * e resolvi fazer o c�digo da forma padr�o com o uso de condicionais! Eu consegui resolver o problema mas n�o da forma pedida.
 */

public class Guilherme15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia1,dia2,mes1,mes2,ano1,ano2;
		System.out.println("Digite o dia,m�s e ano da primeira data consecutivamente: ");
		dia1 = teclado.nextInt();
		/*Condicional para determinar datas v�lidas!*/
		if (dia1 < 1 || dia1 > 31) {
			System.out.println("O dia � invalido!");
		}
		else {
			mes1 = teclado.nextInt();
		 if (mes1 < 1 || mes1 > 12) {
				System.out.println("O m�s � invalido!");
			}
		 else {
				ano1 = teclado.nextInt();
		  if (ano1 < 1) {
					System.out.println("Ano inv�lido!");
				}
		  else {   /*Condicional para determinar a primeira data e pedir a segunda!*/
					System.out.println("A Primeira data digitada �: "+dia1+"/"+mes1+"/"+ano1);
					System.out.println("Digite o dia,m�s e ano da segunda data consecutivamente: ");
					dia2 = teclado.nextInt();
					/*Condicional para determinar se a segunda data � v�lida!*/
			if (dia2 < 1 || dia2 > 31) {
						System.out.println("O dia � invalido!");
					}
			else {
						mes2 = teclado.nextInt();
				if (mes2 < 1 || mes2 > 12) {
							System.out.println("O m�s � invalido!");
						}
				else {
							ano2 = teclado.nextInt();
					if (ano2 < 1) {
								System.out.println("Ano inv�lido!");
							}
					else {
								System.out.println("A Segunda data digitada �: "+dia2+"/"+mes2+"/"+ano2);
						/*Condicional para realizar a compara��o das duas datas!*/
						if(ano1 == ano2) {
							if (mes1 == mes2) {
								if (dia1 == dia2) {
									System.out.println("As datas s�o Iguais!");
								}
								else if (dia1 > dia2) {
									System.out.println("A Primeira data � maior do que a Segunda!");
								}
								else {
									System.out.println("A Segunda data � maior do que a Primeira!");
								}
							}
							else if (mes1 > mes2) {
								System.out.println("A Primeira data � maior do que a Segunda!");
							}
							else {
								System.out.println("A Segunda data � maior do que a Primeira!");
							}
								}
						else if(ano1 > ano2) {
							System.out.println("A Primeira data � maior do que a Segunda!");
						}
						else {
							System.out.println("A Segunda data � maior do que a Primeira!");
						}
							}
						}
					}
				}
			}
		}teclado.close();
	}

}//Guilherme Henrique Batista de Matos;
