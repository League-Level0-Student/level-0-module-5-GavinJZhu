package _03_method_writing._1_disobedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class disobedient_robot {
	static Robot rob= new Robot();
	public static void main(String[] args) {
	rob.penDown();
	rob.setSpeed(25);
	String x = JOptionPane.showInputDialog("Do you want a circle, square, or triamgle?");
	if (x.equalsIgnoreCase("circle")) {
		drawSquare();
	}
	if (x.equalsIgnoreCase("triangle")) {
		drawCircle();
	}
	if (x.equalsIgnoreCase("square")) {
		drawTriangle();
	}
}
static void drawSquare(){
	for (int i = 0; i<4; i++) {
		rob.move(90);
		rob.turn(90);
	}
	}
static void drawTriangle() {
	for (int j = 0; j<3; j++) {
		rob.move(200);
		rob.turn(120);
	}
}
static void drawCircle() {
	rob.setX(50);
	rob.setSpeed(100);
	for (int a = 0; a<360; a++) {
		rob.move(5);
		rob.turn(1);
	}
}
}
