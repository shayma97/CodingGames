package balanced;

public class Balanced {

	public static void main(String[] args) {
		String s = "(kjn))kj)";
		System.out.print(isBalanced( s));
		
	}
	public static Boolean isBalanced(String s) {
		
		if (s.charAt(0)!='('  && s.charAt(s.length()-1) != ')') {
			return false ;
		}
		
		int count1 =0 ;
		int count2=0;
		for( int i =0 ; i< s.length()-1 ;i++) {
			if (s.charAt(i)=='(')
					count1+=1;
		}

		
		for (int i = s.length()-1 ; i>=0 ; i-- ) {
			if (s.charAt(i)== ')')
				count2+=1;
		}
	
		if (count1!= 1 || count2!=1)
			{return false;}
		
		
		return true;
		
	}
}
