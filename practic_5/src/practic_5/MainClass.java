//10 задача "Разворот числа"

package practic_5;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		number = Reverse(number, 0);
		System.out.print("Reverse number: " + number);
	}
	
	static int Reverse(int number, int result)
	{
		result += number % 10;
		if(number / 10 != 0)
			result *= 10;
		else
			return result;
		return Reverse(number / 10, result);
	}

}
