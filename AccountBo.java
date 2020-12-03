package hcl.inheritancebankdetails2;

public class AccountBo  {
	public FixedAccount getAccountDetails(String details)
	{
		String[] det=details.split(",");
		String num=(det[0]);
		Double bal=Double.parseDouble(det[1]);
		String name=det[2];
		Double minbal=Double.parseDouble(det[3]);
		Integer lock=Integer.parseInt(det[4]);
		FixedAccount f=new FixedAccount(num,bal,name,minbal,lock);
		System.out.println("bank details:");
		System.out.println("acntno:"+"\t"+"balance:"+"\t"+" acntholdername:"+"\t"+"minimumbalance"+"\t"+"lockingperiod:");
		System.out.println("f.getAcntholdername()"+"\t"+f.getBalance()+"\t"+f.getAcntno()+"\t"+"f.getMinimumbalance()"+"\t"+"f.getlockingperiod()");
		return f;
	}

	
	}


