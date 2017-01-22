import java.util.Random;

import javax.swing.JOptionPane;

public class dragon {
String name;
int longestBreath;
String type;
Random rand=new Random();
int randInt =rand.nextInt(10);
public static void main(String[] args) {
	dragon a = new dragon("a",1,"blue");
	a.killAKnight();
	
	
	
}
public dragon(String name, int longestBreath,String type){
	this.name=name;
	this.longestBreath=longestBreath;
	this.type=type;
}
public boolean killAKnight(){
	if (longestBreath> randInt) {
		JOptionPane.showMessageDialog(null, name+"succeeded in killing a level "+randInt+" knight.");
		return true;
	}
	else{
	return false; 
	}
}
}

