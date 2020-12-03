package hcl.interfacehandson;

public class GoldStall implements Stall {
	private String stallname;
	private String ownername;
	private int cost;
	private int tvset;

	public GoldStall() {
		// TODO Auto-generated constructor stub
	}

	public GoldStall(String stallname, String ownername, int cost, int tvset) {
		super();
		this.stallname = stallname;
		this.ownername = ownername;
		this.cost = cost;
		this.tvset = tvset;
	}

	public String getStallname() {
		return stallname;
	}

	public void setStallname(String stallname) {
		this.stallname = stallname;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int gettvset() {
		return tvset;
	}

	public void settvset(int tvset) {
		this.tvset = tvset;
	}

	public void Display() {
		System.out.println("print the details");
		System.out.println("stall name:" + getStallname());
		System.out.println("ownername:" + getOwnername());
		System.out.println("cost:" + getCost());
		System.out.println("no of tvset:" + gettvset());
	}
}
