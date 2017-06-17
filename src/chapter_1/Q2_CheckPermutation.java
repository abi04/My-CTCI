package chapter_1;


public class Q2_CheckPermutation {
	
	public static boolean checkPermutation(String input1,String input2){
		
		if(input1.length() != input2.length()) return false;	
		
		
		int[] char_count = new int[128];
		for(char ch : input1.toCharArray()){
			char_count[ch]++;
		}
		for(char ch: input2.toCharArray()){
			char_count[ch]--;
			if(char_count[ch] < 0 )
				return false;
		}
		
		return true;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPermutation("abc", "cba"));

	}

}
