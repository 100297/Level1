
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public Object getName() {

		return name;

	}

	public Object getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public Object getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String master) {
		// TODO Auto-generated method stub
		this.master = master;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}
