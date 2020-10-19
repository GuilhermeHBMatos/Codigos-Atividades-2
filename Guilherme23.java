package ativadeslista2;

import java.util.Scanner;

/*O n�mero de inscri��o no CPF � composto de onze d�gitos decimais, sendo os oito primeiros
aleatoriamente designados no momento da inscri��o. J� o nono (antepen�ltimo) d�gito indica a regi�o fiscal
respons�vel pela inscri��o (MG � a regi�o 6, portanto em todos CPF�s emitidos em MG o nono digito � 6).
Por fim, o d�cimo e o d�cimo primeiro s�o d�gitos verificadores calculados de acordo com um
algoritmo definido pela Receita Federal e publicamente conhecido. Refer�ncias abaixo:
a. http://www.gerardocumentos.com.br/?pg=entenda-a-formula-do-cpf
b. https://bityli.com/CI4gC
Assim, implemente um algoritmo que receba de entrada 11 d�gitos de um CPF qualquer (uma �nica
vari�vel inteira) e verifique se o valor inserido � ou n�o um CPF v�lido. Utilize as refer�ncias citadas
anteriormente para realizar os c�lculos para valida��o.*/

public class Guilherme23 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os 9 primeiros d�gitos do CPF(sem pontua��o) que deseja verficar se � v�lido: ");
		int cpf = teclado.nextInt();
		System.out.println("Digite os 2 �ltimos d�gitos verificadores: ");
		int verificadores = teclado.nextInt();
		teclado.close();
		int ver1 = verificadores%10;
		int ver2 = verificadores/10;
		int di1 = (cpf%10);
		int di2 = (cpf%100)/10;
		int di3 = (cpf%1000)/100;
		int di4 = (cpf%10000)/1000;
		int di5 = (cpf%100000)/10000;
		int di6 = (cpf%1000000)/100000;
		int di7 = (cpf%10000000)/1000000;
		int di8 = (cpf%100000000)/10000000;
		int di9 = (cpf%1000000000)/100000000;
		//C�lculo CPF:
		int peso1,peso2,peso3,peso4,peso5,peso6,peso7,peso8,peso9,soma,resto,verificador1,verificador2;
		peso1 = (di9*10);peso2 = (di8*9);peso3 = (di7*8);peso4 = (di6*7);peso5 = (di5*6);peso6 = (di4*5);peso7 = (di3*4);peso8 = (di2*3);peso9 = (di1*2);
		soma = peso1+peso2+peso3+peso4+peso5+peso6+peso7+peso8+peso9;
		resto = soma%11;
		if (resto < 2) {
			verificador1 = 0;
		}
		else {
			verificador1 = 11 - resto;
		}
		int soma2,resto2;
		soma2 = (di9*11)+(di8*10)+(di7*9)+(di6*8)+(di5*7)+(di4*6)+(di3*5)+(di2*4)+(di1*3)+(verificador1*2);
		resto2 = soma2%11;
		if (resto2 < 2) {
			verificador2 = 0;
		}
		else {
			verificador2 = 11 - resto2;
		}
		if (verificador1 == ver2 || verificador2 == ver1) {
			System.out.println("O CPF: "+di9+di8+di7+"."+di6+di5+di4+"."+di3+di2+di1+"-"+ver2+ver1+" � v�lido!");
		}
		else {
			System.out.println("O CPF: "+di9+di8+di7+"."+di6+di5+di4+"."+di3+di2+di1+"-"+ver2+ver1+" n�o � v�lido!");
		}
	}

}
