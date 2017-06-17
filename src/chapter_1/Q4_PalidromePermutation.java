package chapter_1;

import java.util.HashSet;

public class Q4_PalidromePermutation {
	
	

	public static Boolean checkPalidrome(String str){
		HashSet<Character> set = new HashSet<Character>();
		for(char ch : str.toCharArray()){
			if(Character.isLetter(ch)){
			if(set.contains(ch))
				set.remove(ch);
			else
				set.add(ch);				
		}
		}
		return set.size() <= 1 ? true:false ;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkPalidrome("tact coa"));
		

	}

}
