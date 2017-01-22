
public class Sausage {

	public int taste;
	public int gm; // Grill Marks
	public String type;
public static void main(String[] args) {
	ChocolateFactory a = new ChocolateFactory();
	a.Chocolates(1,2);
	
}
	public Sausage(int gm, String type) {
		this.gm = gm;
		this.type = type;
		taste = 0;
	}

	public void taste(int taste) {
		this.taste = taste++;
		System.out.println("This is a " + taste + " sausage.");
	}

	public void grill() {
		System.out.println("This sausage has " + gm + "grill marks");
	}

	public void express() {
		System.out.println("I am eating a " + type);
	}
}
