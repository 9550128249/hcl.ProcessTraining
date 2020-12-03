package hcl.interfacehandson;
import java.util.*;
public class SimpleIntrest {
	public static void main(String[] args)
	{


		MutualFund mf=new Axis();
		mf.amount();
		mf.duration();
		MutualFund mf1=new HDFC();
		mf.amount();
		mf.duration();
		MutualFund mf2=new ICICI();
		mf2.amount();
		mf2.duration();
		int d=(int)(Axis.amnt*Axis.dur*MutualFund.axis_int);
		System.out.println("The returns in axis bank is"+d);
		int d1=(int)(HDFC.amt*HDFC.durn*MutualFund.hdfc_int);
		System.out.println("The returns in hdfc bank is"+d1);
		int d2=(int)(ICICI.amnt*ICICI.dur*MutualFund.icici_int);
		System.out.println("The returns in icici bank is"+d2);
	}

}
