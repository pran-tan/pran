
public class Person {
	private String name;
	private String address;
	private String phoneNo;
	
	public Person(String name, String address, String phoneNo) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getPhoneNo(){
		return phoneNo;
	}
	
	public void negotiatePurchase() {
		System.out.println(getName() + " is negotating.");
	}
	

}
