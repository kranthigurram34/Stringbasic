package WrapperClases;

public class AutoBoxing {

	public static void main(String[] args) {
int i=10;
Integer j=i;//Automatically Compiler will use Integer.valueOf(i)
Integer k=Integer.valueOf(i);//we are autoboxing manually(primitive to wrapper object)
System.out.println(j);
System.out.println(k);
	}
}