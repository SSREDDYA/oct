package java_Programs;

public class duplicateElementFind

{

	public static void main(String[] args) 
	{

		
		System.out.println("----------------------------------");
		
		String str[]= {"siva","sankar","reddy","siva","1124","1124"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int a=i+1;a<str.length;a++)
			{
				if(str[i]==str[a])
						{
					System.out.println(str[i]);
						}
			}
		}
		
		
		
	}

	}


