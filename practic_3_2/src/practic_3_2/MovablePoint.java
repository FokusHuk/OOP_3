package practic_3_2;

public class MovablePoint implements Movable {
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString()
	{
		return "MovablePoint class: x = " + this.x + ", y = " + this.y + ", xSpeed = " + this.xSpeed + ", ySpeed = " + this.ySpeed;
	}
	public void moveUp() {
		this.y += this.ySpeed;
	}
	public void moveDown() {
		this.y -= this.ySpeed;
	}
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	public void moveRight() {
		this.x += this.xSpeed;
	}
}
