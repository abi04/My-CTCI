package chapter_1;

public class Q3_URLify {

	public static void urlify(char[] ch,int length){
		int newLength = 0;
		int spaceCount=0;
		for(char c:ch){
			if(c == ' ')
				spaceCount++;
		}
		newLength = length + spaceCount *2;
		ch[newLength-1] = '\0';
		for(int i=length-1 ; i>= 0;i--){
			if(ch[i] == ' '){				
			ch[newLength-1] = '0';
			ch[newLength-2] = '2';
			ch[newLength-3] = '%';
			newLength = newLength -3;
			}
			else
			{
				ch[newLength-1] = ch[i];
				newLength = newLength-1;
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "abc de f gh i   j          ";
		char[] ch = new char[test.length()+3*2+1];
		test = test.trim();
		for (int i = 0; i < test.length(); i++) {
			ch[i] = test.charAt(i);
		}
		urlify(ch, test.trim().length());
		System.out.println(String.valueOf(ch));
		
	}

}
