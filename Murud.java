package hcl.interfacehandson;

public class Murud implements Fort {

	@Override
	public void distance(String fortName) {

		System.out.println("you are going to visit" + fortName);
		System.out.println("The Distance is 93 km");
	}
}
