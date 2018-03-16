package WrapperClases;

public class ToString {
	String Name,Address;
	public ToString(String name, String address) {
	this.Name=name;
	this.Address=address;
	}
	public String toString() {
		return Name+" "+Address;
	}
//above method is overidden and is used to convert hashcode values into normal outputs
	public static void main(String[] args) {
		ToString t1=new ToString("kranthi", "Hyd");
		ToString t2=new ToString("kranthi", "Hyd");
		System.out.println(t1);
		System.out.println(t2);
	}

}
