class PalindromeChecker{
	static String s;
	
	PalindromeChecker(String a){
		s = a;	
	}
	static boolean isPalindrome(){
		String rev = "";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		return rev.equals(s);
	}
	
}

public class Palindrome{
	public static void main(String[] args){
		PalindromeChecker p = new PalindromeChecker("malayalam");
		System.out.println("Palindrome ? " + p.isPalindrome());
	}
}

