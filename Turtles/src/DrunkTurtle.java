import Turtle.*;
public class DrunkTurtle extends Turtle{
	private double x,y; // x= random distance, y= random angle
	private int odds;//the odds to turn 

	private void Intizliazing(double distance) {// 
		x=(distance+1)*Math.random();// a random number between 0-x
		odds=(int)(100*Math.random());// a random number between 0-99
		y=(0.5*x+1)*Math.random();// a random number between 0-0.5x
	}

	public void moveForward(double distance) {// move as a drunk turtle
		this.Intizliazing(distance);
		super.moveForward(x);//move the distance of x
		if(odds<=44)	// odds of 45% to turn x angle
			super.turnLeft((int)(x));
		super.moveForward(y);// move the distance of y
	}
	private int Turn(int Angle) {// a random angle to turn between 0-1.5*InputAngle
		return (int)(((Angle+1)*1.5)*Math.random());		
	}
	
	public void turnRight(int Angle) {
		super.turnRight(Turn(Angle));
	}
	
	public void turnLeft(int Angle) {
		super.turnLeft(Turn(Angle));	
	}
	
	protected void turnSober(int Angle) {//helps to the grumpyTurtle to turn as a sober turtle
		super.turnRight(180);	
	}
	
	public void MoveForwardToLine(int i) {// a method to stand in line with all the turtles in the army
		super.turnRight(90);
		super.moveForward(120*i);
		super.turnLeft(90);
	}
}