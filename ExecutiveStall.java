package hcl.interfacehandson;

public class ExecutiveStall implements Stall {
	private String stallname;
	private String ownername;
	private int cost;
	private int screen;

	public ExecutiveStall() {
		// TODO Auto-generated constructor stub
	}

	public ExecutiveStall(String stallname, String ownername, int cost, int screen) {
		super();
		this.stallname = stallname;
		this.ownername = ownername;
		this.cost = cost;
		this.screen = screen;
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

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void Display() {
		System.out.println("print the details");
		System.out.println("stall name:" + getStallname());
		System.out.println("ownername:" + getOwnername());
		System.out.println("cost:" + getCost());
		System.out.println("no of screens:" + getScreen());
	}
}
