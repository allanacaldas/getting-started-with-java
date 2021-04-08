package matrix.application;

import java.util.Scanner;

public class MatrixProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int counter = 0;

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main Diagonal");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					counter++;
				}
			}
		}
				
		System.out.println("Negative numbers in the Matrix: " + counter);

		sc.close();
	}

}
