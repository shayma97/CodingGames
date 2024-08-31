package nonRepeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoRepeat {

	public static void main(String[] args) {
	System.out.println(noRepeat("ababababa"));	
	Map<Character , Integer> result = noRepeat("ababababa") ;
	String ch = new String();
	for (Character c : result.keySet()) {
		ch = ch+ c.toString();
	}
	System.out.println("Sortie = " + result.size() + " la sous chaine est : "+ ch);
	}
	
	
	public static Map<Character,Integer> noRepeat(String s) {
		Map<Character,Integer> occ = new HashMap<>();	
		for ( int i = 0 ; i < s.length() ; i++) {
			if (occ.containsKey(s.charAt(i))){
				occ.put(s.charAt(i), occ.get(s.charAt(i))+1);
			} else {
				occ.put(s.charAt(i), 1);
			}
		}
		
		
		return occ;
	}
	
}
