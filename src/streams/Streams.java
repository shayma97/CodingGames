package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args ) {
		
		
		
		List<Integer> intList = Arrays.asList(5,7,8,9,45,7,5,6);
		
		// Filter pair numbers 
		List<Integer> pairs = intList.stream().filter(n -> n%2 == 0 ).collect(Collectors.toList());
		System.out.println("pairs: " + pairs);
		
		// calcule de la somme 
		int s = intList.stream().reduce(0,Integer::sum);
		System.out.println("sum : "+s );
		
		// Trie la liste en ordre décroissant +	Affiche les trois plus grands nombres
		List<Integer> tri = intList.stream().sorted((a,b)-> b-a).limit(3).collect(Collectors.toList());
		System.out.println("Trie + limit 3 : "+tri);
		//*************************************//
		List<String> names = Arrays.asList("acc","dd","aa","np","abb","daa","ccc","nkk");
		
		// Transformer tous les nom d'une chaine en majuscule 
		List<String> upperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("upperCase"+upperCase);
		
		// Regrouper les chaine de caractère par leurs première lettre
		Map<Character,List<String>> groupedByFirst = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.print("Grouped by first caracter"+ groupedByFirst);	
				                        
	
	}
	

}
