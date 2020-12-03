package hcl.inheritancebankdetails2;

public class Account {
	String Acntno;
	double Balance;
	String Acntholdername;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String acntno, double balance, String acntholdername) {
		super();
		Acntno = acntno;
		Balance = balance;
		Acntholdername = acntholdername;
	}
	public String getAcntno() {
		return Acntno;
	}
	public void setAcntno(String acntno) {
		Acntno = acntno;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getAcntholdername() {
		return Acntholdername;
	}
	public void setAcntholdername(String acntholdername) {
		Acntholdername = acntholdername;
	}
	

}
