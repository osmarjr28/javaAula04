package aula04;

import java.util.Scanner;

public class Exerc01 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int[] v = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int n, result = -1;

		System.out.println("Digite o número que você deseja localizar: ");
		n = read.nextInt();

		for (int cont = 0; cont < v.length; cont++) {
			if (v[cont] == n)
				result = cont;
		}

		if (result != -1)
			System.out.println("\nO numero " + n + " está localizado na posição: " + (resultado));
		else
			System.out.println("\nO numero " + n + " não foi encontrado!");

	}
}
