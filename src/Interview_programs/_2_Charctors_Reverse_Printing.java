package Interview_programs;

public class _2_Charctors_Reverse_Printing {

	public static void main(String[] args) {
	
		String str= "Siva Sankar Reddy Ankireddypalle";
		System.out.println(" Charactor ="+str);
		String temp=" ";
		// print the Charctors  
		for(int a=str.length()-1;a>=0;a--) {
			temp+=str.charAt(a);
			
		}
		System.out.println(" Charactor ="+temp);
		
	}

}
