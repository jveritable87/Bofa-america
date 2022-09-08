package cashreward_creditcard;

public class parmeter_method {

	public static void main(String[] args) {
		parmeter_method total=new parmeter_method();
		total.number(6598, 654564);
		parmeter_method.letter("Dhaka,", "Kishoreganj,");

	}
	public void number(int kilo, int lb ) {
		int weight= kilo+lb;
		System.out.println(weight);
	}

	public static void letter(String city, String dist) {
		String name = city+dist;
		System.out.println(name);
	}

}
