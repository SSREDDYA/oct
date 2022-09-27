package Krishna_Sir_Assignments;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;

public class _1__charactors_Reverse 
{

	public static void main(String[] args) 
	{

		String str = "siva sankar reddy ankireddypalle";
		String temp = "";
		
		System.out.println("Original Sentance...= " + str);
		
		// Reve rse String
		
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			temp = temp + str.charAt(i);

		}

		System.out.println("Reverse Sentance...= " + temp);
		
StringBuilder sb= new StringBuilder(str);
//cn=sb.reverse(str);
		
System.out.println("Reverse Sentance...= " + sb.reverse());
System.out.println("Reverse Sentance...= " + sb.reverse());

		
		
		
		
		

	}
}
