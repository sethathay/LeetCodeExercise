package firstrecurringcharacter;

import java.util.HashMap;

public class MainFunc {
	//Algorithm using HashMap O(n2);
	public static void findFirstRecurringMethod1(String inputString) {
		int lastIndex = inputString.length()-1;
		for(int i = 0; i<=lastIndex; i++) {
			for(int j= i+1; j<=lastIndex; j++) {
				if(inputString.charAt(i) == inputString.charAt(j)) {
					System.out.println(inputString.charAt(j));
					return;
				}
			}
			if(i == lastIndex) {
				System.out.println("Not found");
			}
		}
	}
	//Algorithm using HashMap O(n);
	public static void findFirstRecurringMethod2(String inputString) {
		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
		int lastIndex = inputString.length()-1;
		for(int i = 0; i<=lastIndex; i++) {
			if(maps.containsKey(inputString.charAt(i))){
				System.out.println(inputString.charAt(i));
				return;
			}else {
				maps.put(inputString.charAt(i), 1);
			}
			if(i == lastIndex) {
				System.out.println("Not found");
			}
		}
	}

	public static void main(String[] args) {
		 
		String inputString = "BA";
		findFirstRecurringMethod1(inputString);
		findFirstRecurringMethod2(inputString);

	}

}
