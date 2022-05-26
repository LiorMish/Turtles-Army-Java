import Turtle.*;
public class TwoTurtles {

	public static void main(String[] args) {//create two turtles that will draw letters c and v.
		Turtle corona= new Turtle();//creating turtle that will draw letter c.
		Turtle virus=new Turtle();  //creating turtle that will draw letter v.
		
		corona.turnLeft(90);
		corona.tailUp();
		corona.moveForward(50);
		corona.tailDown();
		corona.moveForward(130);
		corona.turnLeft(90);
		corona.moveForward(130);
		corona.turnLeft(90);
		corona.moveForward(130);
		virus.turnRight(150);
		virus.tailDown();
		virus.moveForward(150);
		virus.turnLeft(115);
		virus.moveForward(150);
	}
}