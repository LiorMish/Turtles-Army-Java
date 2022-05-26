public class GrumpyTurtle extends DrunkTurtle{
	
	private int random=(int)(2*Math.random()+1);// random number 1 or 2

	public void moveForward(double Distance) {// 50% to move like the drunk turtle and 50% to turn 180 degrees
		if(random==1)	
			super.moveForward(Distance);	
		else
			super.turnSober(180);
	}
	
}