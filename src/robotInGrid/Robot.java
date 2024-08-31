package robotInGrid;

import java.util.ArrayList;
import java.util.List;

public class Robot {
	/**
	 * input n , m 
	 * make a list with all the accurence of R and D exp [R,R,D,D]
	 * make all the possible combinations of this list and put them into a list 
	 * 
	 * 
	 *
	 */
	
	public static void main(String[] args) {
		System.out.print(paths(3,3));
	}
	
	public static List<String> paths(int m , int n){
		List<String> path = new ArrayList();
	
		List<String> comb = new ArrayList();
		
		for (int i =0 ; i< m-1 ; i++)
			comb.add("R");	
		for (int i = 0 ; i< n-1 ; i++)
			comb.add("D");
		
		System.out.println(comb);
		for (int i =0 ; i< comb.size()  ; i++  )
		{   
			String p = comb.get(i);	
			
			for(int j= 0 ; j< comb.size() ; j++) {
				if (j!=i) {
					p = p + comb.get(j);
				}		
			}
			path.add(p);
			
		}
		
		return path;
		
	}

}
