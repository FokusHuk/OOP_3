package practic_3;

public class Square extends Rectangle {
	public Square()
	{
		width = 1;
		length = 1;
		color = "white";
		filled = true;
	}
	public Square(double side)
	{
		width = side;
		length = side;
		color = "white";
		filled = true;
	}
	public Square(double side, String color, boolean filled)
	{
		width = side;
		length = side;
		this.color = color;
		this.filled = filled;
	}
	public double getSide()
	{
		return width;
	}
	public void setSide(double side)
	{
		width = side;
		length = side;
	}
	public void setWidth(double side)
	{
		width = side;
		length = side;
	}
	public void setLength(double side)
	{
		width = side;
		length = side;
	}
	public String toString()
	{
		return "Shape: square, side: " + this.width + ", color: " + this.color;
	}
}
