import java.util.Scanner;

import Turtle.*;

public class Army {
	private	static	Scanner sc = new Scanner (System.in);
	private static Turtle [] ArmyOFTurtles = new Turtle [5];//creating array of turtles that will save user choice.
	private  static int TurtleNumber, SizeOfArmy=0;

	public static void main(String[] args) {
		ChooseArmy();  
		StandInLine	();
		tailsDown();	
		moveForward65();
		turnLeft40();
		moveForward75();
		drawHexagon();
		turtlesDisappear();
	}

	public static void ChooseArmy() { // user choose 5 turtles.
		do {
			System.out.println("Choose the type of a turtle:"); //printing the menu to the user
			System.out.println("1.	Simple");
			System.out.println("2.	Smart");
			System.out.println("3.	Drunk");
			System.out.println("4.	Jumpy");
			System.out.println("5.	Box");
			System.out.println("6.	Grumpy");

			TurtleNumber = sc.nextInt(); //getting the user choice.
			if (TurtleNumber==1)
				ArmyOFTurtles [SizeOfArmy] = new Turtle();
			if (TurtleNumber==2)
				ArmyOFTurtles [SizeOfArmy] = new SmartTurtle();
			if (TurtleNumber==3)
				ArmyOFTurtles [SizeOfArmy] = new DrunkTurtle();
			if (TurtleNumber==4)
				ArmyOFTurtles [SizeOfArmy] = new JumpyTurtle();
			if (TurtleNumber==5)
				ArmyOFTurtles [SizeOfArmy] = new BoxTurtle();
			if (TurtleNumber==6)
				ArmyOFTurtles [SizeOfArmy] = new GrumpyTurtle();
			SizeOfArmy++;
		}while (SizeOfArmy<5);
	}

	public static void StandInLine() {// move the turtles to one line with gaps.
		for (int i=1; i<5; i++)
		{
			ArmyOFTurtles [i].tailUp();
			if (ArmyOFTurtles [i] instanceof DrunkTurtle) {
				((DrunkTurtle) ArmyOFTurtles [i]).MoveForwardToLine(i); //using specific method to move the drunk turtle to line.
			}
			else {
				ArmyOFTurtles [i].turnRight(90);
				ArmyOFTurtles [i].moveForward(120*i);
				ArmyOFTurtles [i].turnLeft(90);
			}	
		}
	}

	public static void turtlesDisappear() { //make all the turtles disappear.
		for (int i=0; i<5; i++)
			ArmyOFTurtles [i].hide();
	}

	public static void drawHexagon() { //turtles who knows how to draw will draw a hexagon.
		for (int i=0; i<5; i++) {
			if (ArmyOFTurtles [i] instanceof SmartTurtle)      //check if the turtle is kind of smart turtle,and if yes, he can draw.
				((SmartTurtle)ArmyOFTurtles [i]).draw(6, 40);
		}
	}

	public static void moveForward75() { //every turtle in the army will move by 75.
		for (int i=0; i<5; i++)
			ArmyOFTurtles [i].moveForward(75);
	}

	public static void turnLeft40() {//every turtle in the army will turn left by 50 degrees.
		for (int i=0; i<5; i++)
			ArmyOFTurtles [i].turnLeft(40);
	}

	public static void moveForward65() {//every turtle in the army will move by 65.
		for (int i=0; i<5; i++)
			ArmyOFTurtles [i].moveForward(65);
	}

	public static void tailsDown() {//all the turtles in the army will move their tails down.
		for (int i=0; i<5; i++) 
			ArmyOFTurtles [i].tailDown();
	}

}