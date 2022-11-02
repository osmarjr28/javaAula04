package aula04;

import java.util.Scanner;

public class Exerc03 {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] m = new int[3][3];
		int sumMain = 0, sumSecondary = 0;
		String diagonalMain = "", diagonalSecondary = "";

		for (int iI = 0; iI < m.length; iI++) {

			for (int iJ = 0; iJ < m.length; iJ++) {

				System.out.println("Digite o numero da posição: (" + iI + "," + iJ + "): ");
				m[iI][iJ] = read.nextInt();
			}
		}

	}

}
