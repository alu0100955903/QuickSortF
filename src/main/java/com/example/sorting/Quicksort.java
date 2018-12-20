package com.example.sorting;

/**
 * Practica 6 de Laboratorio de Desarrollo de Herramientas
 * Quicksort y JUnit
 * Liam J. O'kelly
 */ 

public class Quicksort  {

	private int[] numbers;
	private int number;
	/**
	  * Funcion Sort
	 */ 
	public void sort(int[] values) {
		
		/**
		  * Comprueba si hay valores a ordenar
		 */
		
		if (values == null || values.length == 0){
			return;
		}

		/**
		  * Inicializa number e invoca al quicksort
		 */ 
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}



	private void quicksort(int low, int high) {

		int i = low, j = high;
		/**
		  * Establece pivot como el elemento central del array, desde el cual dividir� el array
		 */ 
		int pivot = numbers[low + (high-low) / 2];
		/**
		  * Divide el array en dos partes
		 */
		while (i <= j) {
			/**
			  * Si el elemento actual del lado izquierdo del array es mas peque�o que el pivote, pasamos al siguiente elemento del array izquierdo
			*/
			while (numbers[i] < pivot) {
				i++;
			}
			/**
			 * Si el elemento actual del lado derecho del array es mas grande que el pivote, pasamos al siguiente elemento del array derecho
			*/
			while (numbers[j] > pivot) {
				j--;
			}
			/**
			 * Si encontramos un valor en el array izquierdo que es mayor que el pivote o si encontramos un valor en el array derecho que es menor que el pivote, intercambiamos los valores
			*/
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		/**
		* Recursividad
		*/
		if (low < j)
			quicksort(low, j);

		if (i < high)
			quicksort(i, high);
	}



	private void exchange(int i, int j) {
		/**
		* Recibimos dos valores y los intercambiamos de posicion entre ellos
		*/
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	
	 public static void main(String a[]){
         
		 	/**
	         * Llamamos al constructor del quicksort 
	         */ 
	        Quicksort sorter = new Quicksort();

			 /**
	         * creamos un array con una serie de numeros desordenados 
	         */ 
	        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	        sorter.sort(input);
	        /**
	         * Mostramos los elementos del array ya ordenados. 
	         */ 
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
}