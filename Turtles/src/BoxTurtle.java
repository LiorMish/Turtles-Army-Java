public class BoxTurtle extends SmartTurtle {

	private	final int Size=60;//the size of the rib we chose

	private void draw40() {//  40% to draw a rectangle and ignore the input of the number of sides 
		for(int i=0;i<2;i++) 
		{
			super.moveForward(Size);
			super.turnRight(90);
			super.moveForward(Size/2);
			super.turnRight(90);
		}
	}

	private void draw60 () {// 60% to draw a square and then another ribbed
		super.draw(4, Size);
		super.draw(8, Size);
	}
	
	public void draw(int sides,double size){//check the odds for the painting method
		int random=(int)(10*Math.random());// found a random number between 0-9
		if(random<=3)// the odds are 40%
			this.draw40();
		else
			this.draw60();//the odds are 60%
	}

}