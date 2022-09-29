package Krishna_Sir_Assignmentsforme;


public class _2__Word_charactors_Reverse_in_SameOrder 
{

	public static void main(String[] args)  
	{

		String str = "siva sankar reddy ankireddypalle";

		// Reverse sentance in same order

		System.out.println("Original Sentance...= " + str);

		String words[] = str.split(" ");
		String temp1 = " ";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			// temp1=temp1+sb.toString()+" ";
			temp1 += sb.toString() + " ";

		}
		System.out.println("Reverse sentance in same order..:-" + temp1);

	}
}
