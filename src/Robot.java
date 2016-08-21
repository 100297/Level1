
public class Robot {
	int numberOfWheels;
	Knife knife;
	String name;
	boolean isEvil;

	public void Destroy(double sh) {
		if (isEvil == true) {
			System.out.println(name + " has just destroyed the human race with a knife of the sharpness " + sh + ".");
		} else {
		System.out.println(name +" is a lover  of the human race");
		}
	}

	public Robot(boolean evil, String n) {
		numberOfWheels = 4;
		knife = new Knife(1.2);
		name = n;
		isEvil = evil;
	}

}
