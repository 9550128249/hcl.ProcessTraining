package hcl.inheritancebankdetails2;

public class FixedAccount extends SavingAccount {
	int lockingperiod;
	public FixedAccount() {
		// TODO Auto-generated constructor stub
	}
	public FixedAccount(String acntno, double balance, String acntholdername,double minimumbalance,int lockingperiod) {
		super(acntno,balance,acntholdername,minimumbalance);
		this.lockingperiod = lockingperiod;
	}
	public int getLockingperiod() {
		return lockingperiod;
	}
	public void setLockingperiod(int lockingperiod) {
		this.lockingperiod = lockingperiod;
	}
	
	

}
