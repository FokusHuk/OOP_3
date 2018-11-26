package practic_6;

public class Student {
	String name;
	int ID;
	int points;
	
	Student(String _name, int _ID, int _points)
	{
		name = _name;
		ID = _ID;
		points = _points;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public String toString()
	{
		return ID + ". "+ name + ", " + points + " points";
	}
}
