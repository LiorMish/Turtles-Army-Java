public class JumpyTurtle extends SmartTurtle{
	private boolean isDown=false;// helper variable to save the tails status.
	
	public void tailDown () { //moves the turtle's tail down and replace the value of the helper variable to true;
		super.tailDown();
		isDown=true;

	}
	public void tailUp () {//moves the turtle's tail down and replace the value of the helper variable to false;
		super.tailUp();
		isDown=false;

	}
	private boolean isDown() {//return the status of the turtle tail.
		return isDown;
	}
	private void moveLong(double distance) {// the turtle is moving to a distance larger then 10 draw line  fragmented
		while(distance>10) {
			super.moveForward(5);
			distance-=5;
			super.tailUp();
			super.moveForward(5);
			distance-=5;
			super.tailDown();
		}
		this.moveForward(distance);
	}
	private void moveMid(double distance) // the turtle is moving to a distance between 5-10 and will draw line  fragmented.
	{
		super.moveForward(5);
		distance-=5;
		super.tailUp();
		super.moveForward(distance);
		super.tailDown();
	}

	public void moveForward(double distance) {// the turtle is moving forward and if the tails is down he  will draw fragmented.
		if(isDown()) { //check if the tails is down 
			if(distance<5)
				super.moveForward(distance); 
			else if(distance>10) 
				this.moveLong(distance);//using move long function if the distance is larger then 10.
			else 
				this.moveMid(distance);//using move mid function if the distance is larger then 10.
		}
		else
			super.moveForward(distance);	//the tail is up move regular.

	}

	public void draw (int sides, double size) {// knows to draw any ribbed with given sides and size
		this.tailDown();
		for(int i=0;i<sides;i++) 
		{
			
			this.moveForward(size);
			super.turnRight(360/sides);
		}
	}

}