package chapter_1;

public class Q1_UniqueString {

	public static boolean isUnique(String input) {

		if (input.length() > 128)
			return false;
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < input.length() - 1; i++)
			if (Character.isLetter(input.charAt(i))) {
				{
					int val = input.charAt(i);
					if (char_set[val])
						return false;

					char_set[val] = true;

				}
			}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique("abcdefgkasdmsan"));

	}

}
