package practic_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
	@Override
	public int compare(Student student_1, Student student_2)
	{
		if(student_1.getPoints() > student_2.getPoints())
			return 1;
		else if(student_1.getPoints() < student_2.getPoints())
			return -1;
		else
			return 0;
	}
}
