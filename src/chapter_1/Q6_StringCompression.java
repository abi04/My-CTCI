package chapter_1;

public class Q6_StringCompression {

	public static String StringCompression(String input1){
		int count = 0;
		int index = 0;
		StringBuilder sb = new StringBuilder();
		Character  current_char = '\0';
		
		while(index < input1.length()){			
			current_char = input1.charAt(index);
				while(index < input1.length() && input1.charAt(index) == current_char){
					if(input1.charAt(index) == current_char)
					{
						count++;
						index++;						
					}					
				}
				sb.append(current_char);
				sb.append(count);
				count = 0;
			}
		
		
		return sb.length() < input1.length()? sb.toString():input1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringCompression("aabccccccaaa"));
		
	}

}
