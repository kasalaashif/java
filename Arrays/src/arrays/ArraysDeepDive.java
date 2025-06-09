package arrays;

public class ArraysDeepDive {
	
	public static void main(String[] args) {
		
		// Crud Create Operation
		//1D
		int[] array1D = new int[10];
		
		// 2D
		int[][] array2D = new int[5][5];
		
		// 3D
		int[][][] array3D = new int[3][3][3];
		
		// cRud Read Operation
		// Traversal or direct read.
		System.out.println("Direct Print accessing the element");
		System.out.println(array1D[6]);
		
		System.out.println("Traversal using array length");
		// Using arr.length array1D
		for(int i = 0; i < array1D.length; i++) {
			System.out.print(array1D[i]);
		}
		System.out.println("");
		
		// Using arr.length array2D
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j]);
			}
		}
		System.out.println("");
		
		// Using arr.length array2D
		for(int i = 0; i < array3D.length; i++) {
			for(int j = 0; j < array3D[i].length; j++) {
				for(int k = 0; k < array3D[i][j].length; k++) {
					System.out.print(array3D[i][j][k]);
				}
			}
		}
		System.out.println("");
		
		// for Each Loop array1D
		for(int i : array1D) {
			System.out.print(i);
		}
		System.out.println("");
		
		// for Each Loop array2D
		for(int[] arr : array2D) {
			for(int i : arr) {
				System.out.print(i);
			}
		}
		System.out.println("");	
		
		// for Each Loop array2D
		for(int[][] arr2d : array3D) {
			for(int[] arr : arr2d) {
				for(int j : arr) {
					System.out.print(j);
				}
			}
		}
		System.out.println("");
	}
}
