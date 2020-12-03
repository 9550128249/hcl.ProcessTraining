package hcl.inheritancebankdetails2;

public class SavingAccount extends Account {
	double minimumbalance;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(String acntno, double balance, String acntholdername,double minimumbalance) {
		super(acntno,balance,acntholdername);
		this.minimumbalance = minimumbalance;
	}
	public double getMinimumbalance() {
		return minimumbalance;
	}
	public void setMinimumbalance(double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
	
	

}
