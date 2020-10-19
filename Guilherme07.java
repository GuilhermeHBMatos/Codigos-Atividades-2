package ativadeslista2;

import java.util.Scanner;

/*Questão 07: Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
digitado é ou não uma vogal.*/

public class Guilherme07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o caracter que deseja descobrir se é vogal ou não: ");
		String palavra = teclado.next();
		teclado.close();
		String letra = palavra.substring(0, 1);
		if (("a".equals(letra)) || 
		    ("e".equals(letra)) || 
		    ("i".equals(letra)) ||
		    ("o".equals(letra)) ||
		    ("u".equals(letra)) ||
		    ("A".equals(letra)) ||
		    ("E".equals(letra)) ||
		    ("I".equals(letra)) ||
		    ("O".equals(letra)) ||
		    ("U".equals(letra))){
			System.out.println("A primeira letra digitada é um vogal!");
		}
		else {
			System.out.println("A primeira letra digitada não é um vogal!");
		}
	}
}//Guilherme Henrique Batista de Matos;
