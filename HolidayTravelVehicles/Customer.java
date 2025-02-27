public class Customer extends Person {
	
	private String customerID;
	
	public Customer(String name, String address, String phoneNo, String customerID) {
        super(name, address, phoneNo);
        this.customerID = customerID;
    }
	
	public String getCustomerID() {
        return customerID;
    }

    public void tradeVehicle() {
        System.out.println(getCustomerID() + getName() + " is trading vehicle.");
    }

}
