package ativadeslista2;

import java.util.Scanner;

/*Quest�o 19: Implemente um algoritmo que receba de entrada um valor inteiro com 4 d�gitos e verifique se o mesmo
pertence � fam�lia dos bin�rios. Para isto, �desmembre� o n�mero digitado verifique se foram digitados
somente bits. Caso o n�mero digitado seja bin�rio, seu algoritmo deve o converter para decimal e mostrar o
resultado.*/

public class Guilherme19 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("(Qualquer caractere que n�o seja n�meros ser� considerado inv�lido!)");
		System.out.println("Digite um n�mero/valor inteiro de 4 d�gitos: ");
		String num = teclado.next();
		teclado.close();
		String uni = num.substring(3);
		String dez = num.substring(2);
		String cen = num.substring(1);
		String mil = num.substring(0);
		int numcompleto = Integer.parseInt(num);
		int unidade = Integer.parseInt(uni);
		int dezena = Integer.parseInt(dez)/10;
		int centena = Integer.parseInt(cen)/100;
		int milhar = Integer.parseInt(mil)/1000;
		if ((unidade == 1 || unidade == 0) && (dezena == 1 || dezena == 0) && (centena == 1 || centena == 0) && (milhar == 1 || milhar == 0)){
			int decimal = Integer.parseInt(num,2);
			System.out.println("O n�mero digitado pode ser considerado bin�rio!");
			System.out.println("O valor digitado �: "+num);
			System.out.println("O seu valor em decimal � de: "+decimal);
		}
		else if ((unidade > 1) || (dezena > 1) || (centena > 1) || (milhar > 1) || (numcompleto < 0 || numcompleto > 0)) {
			System.out.println("O n�mero digitado n�o pode ser considerado bin�rio!");
			System.out.println("Seu valor � de: "+num);
		}
		else {
			System.out.println("Voc� utilizou algum caractere inv�lido!");
		}
		
	}

}//Guilherme Henrique Batista de Matos;
