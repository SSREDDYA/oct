package Interview_programs;

public class _3_word_Printing {

	public static void main(String[] args) {
	
		String str= "Siva Sankar Reddy Ankireddypalle";
		System.out.println(" Charactor ="+str);
		String[] word=str.split(" ");
		// print the Charctors  
		for(int a=0;a<=word.length;a++) {
			String temp=word[a];
			System.out.println(" word "+a+ "  ="+temp);
			
		}
		//System.out.println(" Charactor ="+temp);
		
	}

	
	}


