import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
 private static Object Bug;

public static void main(String[] args) {
	Random r = new Random(); 
	World world= new World();
	 world.show();
	Bug Beetle = new Bug();
	 Bug lady = new Bug();
	lady.setColor(Color.BLUE);
	Location loc = new Location(1,3);
	world.add(new Location(r.nextInt(10),r.nextInt(10)), Beetle);
	world.add(loc, lady);
lady.turn();
lady.turn();
lady.turn();
lady.turn();
lady.turn();
lady.turn();
Flower a = new Flower();
world.add(new Location(1, 2), a);
Flower b = new Flower();
world.add(new Location(1, 4), b);
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		if(j%2 == 1) {
		a.setColor(Color.BLUE);
		}else{ a.setColor(Color.RED);
		}
			world.add(new Location(i,j), a);
		
		}
}




}                                    
	
 
}
