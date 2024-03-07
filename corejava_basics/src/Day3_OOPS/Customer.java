//program to demonstrate the customer entity class
package Day3_OOPS;

public class Customer {
	private int cid;
	private String Cname;
	private String address;
	//set and get
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
}
