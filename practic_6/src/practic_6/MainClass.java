package practic_6;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		Student[] array = new Student[5];
		array[0] = new Student("Hope", 5, 100);
		array[1] = new Student("Hayley", 2, 95);
		array[2] = new Student("Klaus", 3, 70);
		array[3] = new Student("Elijah", 4, 70);
		array[4] = new Student("Rebekah", 1, 65);
		
		Student temp;
		
		//1
		System.out.print("Unsorted list:\n");
		for(Student st : array)
			System.out.println(st.toString());
		
		//2
		System.out.print("\nSorted by ID:\n");
		for(int i = 0; i < array.length; i ++)
			for(int j = 0; j < array.length - 1; j ++)
				if(array[j].getID() > array[j+1].getID())
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		for(Student st : array)
			System.out.println(st.toString());
		
		//3
		System.out.print("\nSorted by points:\n");
		Arrays.sort(array, new SortingStudentsByGPA());
		for(Student st : array)
			System.out.println(st.toString());
		
		//4
		Student[] array2 = new Student[3];
		array2[0] = new Student("Damon", 6, 35);
		array2[1] = new Student("Stefan", 8, 90);
		array2[2] = new Student("Elena", 7, 70);
		System.out.print("\nSecond list:\n");
		for(Student st : array2)
			System.out.println(st.toString());
		
		Student[] array3 = new Student[array.length + array2.length];
		for(int i = 0; i < array.length + array2.length; i ++)
		{
			if(i < array.length)
				array3[i] = array[i];
			else
				array3[i] = array2[i - array.length];
		}
		System.out.println("\nJoined list sorted by ID:\n");
		for(int i = 0; i < array3.length; i ++)
			for(int j = 0; j < array3.length - 1; j ++)
				if(array3[j].getID() > array3[j+1].getID())
				{
					temp = array3[j];
					array3[j] = array3[j+1];
					array3[j+1] = temp;
				}
		for(Student st : array3)
			System.out.println(st.toString());
	}

}
