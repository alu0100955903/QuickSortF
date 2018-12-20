package com.example.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testMain() {
		
		int [] input = new int[]{6,1,7,9,3,8,2,5,4,0};
		Quicksort sort = new Quicksort();
		sort.sort(input);
		String result = new String();
	
		for(int i:input)
			result = result + " " + i;
		
		 /**
         * Comprobamos que la lista desordenada que le pasamos da como salida 
         * la lista ordenada, cumpliendo el formato que se le pasa como string. 
         * 
         */ 
		assertEquals(" 0 1 2 3 4 5 6 7 8 9", result);
	}

}
