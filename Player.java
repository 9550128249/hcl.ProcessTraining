package hcl.assignmentproblem2;

public class Player {
	String name;
	String country;
	String skill;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, String country, String skill) {
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
		return String.format("%s\t%s\t%s",name,country,skill);
	}
	

}
