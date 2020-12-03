package hcl.assignmentproblem4;

public class Player4 {
	String name;
	String country;
	String skill;
	public Player4() {
		// TODO Auto-generated constructor stub
	}
	public Player4(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\t%s\t%s");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("name"+"\t"+"country"+"\t"+"skill");
	}
	

}
