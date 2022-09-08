package cashreward_creditcard;

public class Static1_method {

	public static void main(String[] args) {
		Static1_method.credit1();
		Static1_method.credit2();

	}
	public static void credit1() {
		int cat= 65;
		int bat= 56;
		int lat= cat+bat;
		System.out.println(lat);
	}
	public static void credit2() {
		String name= "visa,";
		String middlename= "signature,";
		String lastname= name + middlename;
		System.out.println(lastname);
	}

}
