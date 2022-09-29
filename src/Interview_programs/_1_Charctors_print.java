package Interview_programs;

public class _1_Charctors_print {

	public static void main(String[] args) {
	
		String str= "Siva Sankar Reddy Ankireddypalle";
		System.out.println(" Charactor ="+str);
		
		// print the Charctors  
		for(int a=0;a<=str.length();a++) {
			
			System.out.println(a+") Charactor ="+str.charAt(a));
		}
		
	}

}
