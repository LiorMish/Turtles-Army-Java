import Turtle.*;
public class SmartTurtle extends Turtle {
	
	public void draw(int sides, double size) {// knows to draw any ribbed with given sides and size
		super.tailDown();
		for(int i=0;i<sides;i++) 
		{
			super.moveForward(size);
			super.turnRight(360/sides);
		}
	}

}