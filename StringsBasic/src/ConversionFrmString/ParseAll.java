package ConversionFrmString;

public class ParseAll {

	public static void main(String[] args) {
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i);
		//String to Int
		
		String s1="1.5";
		float i1=Float.parseFloat(s1);
		System.out.println(i1);
		//String to Float
		
		String s2="22.36";
		double i2=Double.parseDouble(s2);
		System.out.println(i2);
		//String to Double
		
		String s3="9700489109";
		long i3=Long.parseLong(s3);
		System.out.println(i3);
		//String to Long
		
		String s4="ok";
		String s5="true";
		String s6="TRUE";
		String s7="TRue";
		
		boolean i4=Boolean.parseBoolean(s4);
		boolean i5=Boolean.parseBoolean(s5);
		boolean i6=Boolean.parseBoolean(s6);
		boolean i7=Boolean.parseBoolean(s7);

		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		//String to Boolean
		
		String s8="anudeep";
		char c=s8.charAt(6);
		System.out.println(c);
		//String to char using charAt() method
		
	}

}
