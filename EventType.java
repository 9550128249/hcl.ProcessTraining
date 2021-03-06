package hcl.exception;

public class EventType extends Exception {
	private Long id;
	private String name;
	public EventType() {
	}
	public EventType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%ld\t%s",id,name);
	}
	

}
