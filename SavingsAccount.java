package hcl.inheritancebankdetails;

public class SavingsAccount extends Account {
	private String orgName;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String acntname, String acntno, String bankname, String orgName) {
		super(acntname, acntno, bankname);
		this.orgName = orgName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

}
