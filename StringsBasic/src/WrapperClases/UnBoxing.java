package WrapperClases;

public class UnBoxing {

	public static void main(String[] args) {
Integer i=new Integer(10);
int y=i;//Compiler by default uses intValue() method 
int z=i.intValue();//we are declaring obj.intValue() method
System.out.println(y);
System.out.println(z);
	}
}