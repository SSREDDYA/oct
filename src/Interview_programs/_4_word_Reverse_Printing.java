package Interview_programs;

public class _4_word_Reverse_Printing {

	public static void main(String[] args) {
	
		String str= " Ankireddypalle";
		System.out.println(" Original sentance ="+str);
		String temp = " ";
		
		//word_Reverse_Printing   
		
				
		for(int a=str.length()-1;a>=0;a--) {
			 temp = temp + str.charAt(a);
			//String temp=word[a];
			
		}
		System.out.println(" Reverse word  ="+temp);
		
	}

	
	}


