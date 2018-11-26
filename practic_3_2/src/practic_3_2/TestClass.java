package practic_3_2;

public class TestClass {

	public static void main(String[] args) {
		MovableCircle mc = new MovableCircle(0, 0, 2, 4, 5);
		System.out.println(mc.toString());
		mc.moveRight();
		mc.moveUp();
		System.out.println(mc.toString());
		mc.moveLeft();
		mc.moveDown();
		System.out.println(mc.toString());
	}

}
