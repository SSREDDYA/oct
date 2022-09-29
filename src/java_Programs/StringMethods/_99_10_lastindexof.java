package java_Programs.StringMethods;

public class _99_10_lastindexof {

	public static void main(String[] args) {

		String str = "SivaSankarReddy";
		String str1 = "SivaSankarReddy";
		String str2 = "ShivaShankarReddy";
		String str3 = "SIVASANKARREDDY";

		System.out.println("e last Index number is  := " + str.lastIndexOf("e"));
		System.out.println("s last Index number is  := " + str.lastIndexOf("s"));
		System.out.println("va last Index number is  := " + str.lastIndexOf("va"));
		System.out.println("ivaSankarReddy last Index number is  := " + str.lastIndexOf("SankarReddy"));
		System.out.println("nkarReddy last Index number is  := " + str.lastIndexOf("ivaSankarReddy"));
		System.out.println("mf last Index number is  := " + str.lastIndexOf("mf"));

	}

}
