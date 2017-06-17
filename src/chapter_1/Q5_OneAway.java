package chapter_1;

public class Q5_OneAway {
	
	public static boolean oneAway(String input1,String input2){
		
		if(Math.abs(input1.length()- input2.length()) > 1)
			return false;
		String larger = input1.length() > input2.length() ? input1 : input2 ;
		String smaller = input1.length() > input2.length() ? input2 : input1;
		
		int larger_index =0 ;
		int smaller_index = 0;
		boolean duplicate = false;
		
		while(larger_index < larger.length() && smaller_index < smaller.length()){
			
			if(larger.charAt(larger_index) != smaller.charAt(smaller_index)){
				
				if(duplicate)
					return false;
				
				duplicate = true;
				
				if(larger.length() == smaller.length())
					smaller_index++;
				
			}
			else
				smaller_index++;
			
			larger_index++;
			
			
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(oneAway("pale","bale"));
		System.out.println(oneAway("pales","bale"));
		System.out.println(oneAway("pale","pales"));
		System.out.println(oneAway("pale","bake"));

	}

}
