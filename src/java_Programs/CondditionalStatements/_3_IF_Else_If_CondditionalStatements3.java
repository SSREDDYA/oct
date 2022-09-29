package java_Programs.CondditionalStatements;

public class _3_IF_Else_If_CondditionalStatements3 {

	public static void main(String[] args) {

		int a = 25;
		int b = 25;
		int c = 25;

		if (a > b && a>c ) {
			System.out.println("A is bigg value");

		}
		else if  (b > c && b>a ) {
			System.out.println("b is bigg value");

		}
		else if  (c > b && c>a ) {
			System.out.println("c is bigg value");

		}
		else {
			System.out.println("a,b,c are equal values ");

		}
	}

}
