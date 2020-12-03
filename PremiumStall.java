package hcl.interfacehandson;

public class PremiumStall implements Stall {
	private String stallname;
	private String ownername;
	private int cost;
	private int projector;

	public PremiumStall() {
		// TODO Auto-generated constructor stub
	}

	public PremiumStall(String stallname, String ownername, int cost, int projector) {
		super();
		this.stallname = stallname;
		this.ownername = ownername;
		this.cost = cost;
		this.projector = projector;
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

	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}

	public void Display() {
		System.out.println("print the details");
		System.out.println("stall name:" + getStallname());
		System.out.println("ownername:" + getOwnername());
		System.out.println("cost:" + getCost());
		System.out.println("no of projectors:" + getProjector());
	}
}
