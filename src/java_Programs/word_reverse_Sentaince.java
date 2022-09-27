package java_Programs;

public class word_reverse_Sentaince
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str = "siva sankar reddy";

		String[] word = str.split(" ");

		System.out.println("Original sentance...:=" + "  " + str);

		for (int i = word.length - 1; i >= 0; i--)
		{

			System.out.print(word[i] + " ");

		}

	}

}
