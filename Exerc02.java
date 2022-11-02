package aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc02 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.00");

		int[] v = new int[10];

		float sum = 0.0f, media = 0.0f;

		String unaqualed = "", couple = "";

		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero: ");
			v[i] = read.nextInt();

		}
		for (int i = 1; i < v.length; i += 2) {

			unaqualed += v[i] + " ";
		}
		for (int i = 0; i < v.length; i++) {

			if (v[i] % 2 == 0)
				couple += v[i] + " ";

			sum += v[i];

		}

		System.out.println("Elementos do vetor contidos em indices impares\n");
		System.out.println(unaqualed);

		System.out.println("\n\nElementos do vetor que são pares:\n");
		System.out.println(couple);

		System.out.println("\n\nSoma de todos Elementos do vetor é:\n");
		System.out.println(sum);

		media = sum / v.length;
		System.out.println("\n\nA Média de todos Elementos do vetor é:\n");
		System.out.println(df.format(media));
	}

}
