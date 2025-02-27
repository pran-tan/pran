
public class Salesperson extends Person {
	
	public Salesperson(String name, String address, String phoneNo) {
        super(name, address, phoneNo);
    }
	
	public void fillInvoice() {
        System.out.println(getName() + " is filling out an invoice.");
    }

}
