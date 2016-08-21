
public class RunnerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot e = new Robot(true, "knife_man");
		Robot b = new Robot(false, "gearo1");
		Robot a = new Robot(true, "zero");
		Robot d = new Robot(false , "red_Tornado");
		
		
		a.Destroy(8.9);
		d.Destroy(0.0);
		e.Destroy(1.0);
		b.Destroy(0.0);
	
	
	}

}
