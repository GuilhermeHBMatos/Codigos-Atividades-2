package ativadeslista2;

import java.util.Scanner;

/*Questão 19: Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
somente bits. Caso o número digitado seja binário, seu algoritmo deve o converter para decimal e mostrar o
resultado.*/

public class Guilherme19 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("(Qualquer caractere que não seja números será considerado inválido!)");
		System.out.println("Digite um número/valor inteiro de 4 dígitos: ");
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
			System.out.println("O número digitado pode ser considerado binário!");
			System.out.println("O valor digitado é: "+num);
			System.out.println("O seu valor em decimal é de: "+decimal);
		}
		else if ((unidade > 1) || (dezena > 1) || (centena > 1) || (milhar > 1) || (numcompleto < 0 || numcompleto > 0)) {
			System.out.println("O número digitado não pode ser considerado binário!");
			System.out.println("Seu valor é de: "+num);
		}
		else {
			System.out.println("Você utilizou algum caractere inválido!");
		}
		
	}

}//Guilherme Henrique Batista de Matos;
