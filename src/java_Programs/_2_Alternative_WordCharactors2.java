package java_Programs;

public class _2_Alternative_WordCharactors2
{

	public static void main(String[] args)
	{
		
		String s = "online testing help krishsoft";
		
		System.out.println("Original sentance..:-"+s);

		 String result = "";
		   String[] words = s.split(" ");
		   // we'll reverse only every second word according to even/odd index
		   for (int i = 0; i < words.length; i++)
		   {
		       if (i % 2 == 1)
		       {
		           result += " " + reverse(words[i]);
		       }
		       else
		       {
		           result += " " + words[i];
		       }
		       System.out.println("Original sentance..:-"+result);
		   }
		   return; 
		}


	private static String specialReverse(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

	}	
		
		
	


		
	



		
		
		
		
		
		
		