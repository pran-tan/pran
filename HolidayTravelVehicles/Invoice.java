public class Invoice {
	
	Customer customerInfo;
	Vehicle vehicleInfo;
	private double tradeInAllowance;
    private double price;
    private double tax;
    private double licenseFee;

    public Invoice(Customer customerInfo, Vehicle vehicleInfo, double tradeInAllowance, double tax, double licenseFee) {
        this.customerInfo = customerInfo;
        this.vehicleInfo = vehicleInfo;
        this.tradeInAllowance = tradeInAllowance;
        this.price = vehicleInfo.getBaseCost() - tradeInAllowance;
        this.tax = tax;
        this.licenseFee = licenseFee;
    }

    public Customer getCustomer() {
        return customerInfo;
    }

    public Vehicle getVehicle() {
        return vehicleInfo;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public double getLicenseFee() {
        return licenseFee;
    }

    public double getTotalAmountDue() {
        return price + tax + licenseFee;
    }


}
