package hcl.inheritancebankdetails;

public class CurrentAccount extends Account {
	String tinNumber;

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String acntname, String acntno, String bankname, String tinNumber) {
		super(acntname, acntno, bankname);
		this.tinNumber = tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

}
