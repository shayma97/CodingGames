package camion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Camion {

	public static void main(String args[]) {
		List <Integer> trucs =List.of(2, 3, 7, 8, 1);
		System.out.println(minTrucks(trucs, 10));
	}
// List.of(2, 3, 7, 8, 1), 10)); // 2
	    public static int minTrucks(List<Integer> weights, int capacity) {
	    	List<Integer> w = new ArrayList<Integer>(weights);
	    	Collections.sort(w,Collections.reverseOrder());
	    	System.out.println(w);
	    	
			return capacity;
	      //sort the table -1
		 // add the 
			
		
			
	    }

}
