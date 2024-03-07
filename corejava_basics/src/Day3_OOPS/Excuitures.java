package Day3_OOPS;

public class Excuitures {
	public static void main(String[] args) {
		Customer c1 =new Customer();
		c1.setCid(112);
		c1.setCname("Gopal");
		c1.setAddress("north india");

		System.out.print("Customer id "+c1.getCid()+" Customer name "+c1.getCname()+" Customer address "+c1.getAddress());	
	}
}
