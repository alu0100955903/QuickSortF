package com.example.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testMain() {
		
		 /**
         * creamos un array con una serie de numeros desordenados 
         */ 
		
		int [] entrada = new int[]{48,59,0,26,5,7,1,32,43,15};
	
		 /**
         * Llamamos al constructor del quicksort 
         */ 
		Quicksort sorter = new Quicksort();
		
		sorter.sort(entrada);
		String result = new String();
	
		for(int i:entrada)
			result = result + ", " + i;
		
		 /**
         * El assert comprueba que el quicksort devuelve como salida, el array que le entro, 
         * pero ordenado y separado por comas como se le ha especificado en el string resultado
         */ 
		assertEquals(", 0, 1, 5, 7, 15, 26, 32, 43, 48, 59", result);

	}

}
