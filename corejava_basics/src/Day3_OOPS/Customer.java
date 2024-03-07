//program to demonstrate the customer entity class
package Day3_OOPS;

public class Customer {
	private int cid;
	private int usercash;
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
	public int getUsercash() {
		return usercash;
	}
	public void setUsercash(int usercash) {
		this.usercash = usercash;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", usercash=" + usercash + ", Cname=" + Cname + ", address=" + address + "]";
	}
	
	
}
