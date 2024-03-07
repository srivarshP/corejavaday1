package Day3_OOPS;

public class Excuitures {
	public static void main(String[] args) {
		Customer c1 =new Customer();
		c1.setCid(112);
		c1.setCname("Gopal");
		c1.setAddress("Tamil Nadu");
		c1.setUsercash(1000);
		
		Customer c2 =new Customer();
		c2.setCid(113);
		c2.setCname("Varma");
		c2.setAddress("Rajastan");
		c2.setUsercash(1000);
		
		Customer c3 =new Customer(114,"jacob","china town");
		Customer c4 =new Customer();
		System.out.println(c1.getCid());
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
