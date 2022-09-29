package Interview_programs;

public class _6_Alternative_Word_Reverse_in_Sentance {

	
	public static void main(String[] args) {
	
		String s1 = "Siva Sankar Reddy Ankireddypalle";

		System.out.println("Original sentance..:-" + s1);
		
		String result = "";
		String[] words = s1.split(" ");
		
		// we'll reverse only every second word according to even/odd index
	
		for (int i = 0; i < words.length; i++)

		{
			if (i % 2 == 1) {
				result += " " + reverse(words[i]);
			} else {
				result += " " + words[i];
			}

		}System.out.println("Alternative word reverse ..:-" + result);
		

		
	}

	// easiest way to reverse a string in Java in a "one-liner"
	
	public static String reverse(String word) {
		return new StringBuilder(word).reverse().toString();
	}

}
