package aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {

	public static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float[][] m = new float[10][4];
		float[] media = new float[10];
		float sum = 0.0f;
		int sizeI = 0, sizeJ = 0;
		DecimalFormat df = new DecimalFormat("#.0");
		
		if (m.length > 0)
		{
			sizeI = m.length;
			sizeJ = m[0].length;            
		}
		 
		for (int iI = 0; iI < sizeI; iI++) {

			for (int iJ = 0; iJ < sizeJ; iJ++) {

				System.out.println("Digite a " + (iJ + 1) + "º nota do participante " + (indiceI + 1) + ": ");
				m[iI][iJ] = read.nextFloat();

			}

		}

		for (int iI = 0; iI < sizeI; iI++) {

			for (int iJ = 0; iJ < sizeJ; iJ++) {

				sum += m[iI][iJ];

			}

			media[iI] = sum / sizeJ;
			sum = 0.0f;

		}

		for (int iI = 0; iI < media.length; iI++) {

			System.out.println("\nMédia do participante " + (iI + 1) + ": " + df.format(media[iI]));

		}
	}

}
