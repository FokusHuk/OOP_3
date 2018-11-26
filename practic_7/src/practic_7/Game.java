package practic_7;

import java.util.Scanner;
import java.util.ArrayDeque;

public class Game {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two card's sets:\n");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		String[] str_array1 = word1.split(" ");
		String[] str_array2 = word2.split(" ");
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		ArrayDeque<Integer> deck1 = new ArrayDeque<>(5);
		ArrayDeque<Integer> deck2 = new ArrayDeque<>(5);
		for(int i = 0; i < 5; i ++)
		{
			array1[i] = Integer.parseInt(str_array1[i]);
			array2[i] = Integer.parseInt(str_array2[i]);
			deck1.add(array1[i]);
			deck2.add(array2[i]);
		}
		int count = 106;
		boolean gameEnding = false;
		while(count != 0 && !gameEnding)
		{
			count --;
			System.out.println("\n\n_____________" + count + "______________");
			System.out.println("first player\tsecond player");
			System.out.println(deck1.getFirst().toString() + "\t\t" + deck2.getFirst().toString());
			if(deck1.getFirst() < deck2.getFirst() || (deck1.getFirst() == 9 && deck2.getFirst() == 0))
			{
				deck2.addLast(deck1.getFirst());
				deck2.addLast(deck2.getFirst());
				deck2.pollFirst();
				deck1.pollFirst();
			}
			else
			{
				deck1.addLast(deck1.getFirst());
				deck1.addLast(deck2.getFirst());
				deck2.pollFirst();
				deck1.pollFirst();
			}
			
			System.out.print("first: ");
			for(int i : deck1)
				System.out.print(i + " ");
			System.out.print("\nsecond: ");
			for(int i : deck2)
				System.out.print(i + " ");
			
			if(deck1.isEmpty())
			{
				System.out.println("\n\n=====second player won=====");
				gameEnding = true;
			}
			else if(deck2.isEmpty())
			{
				System.out.println("\n\n======first player won======");
				gameEnding = true;
			}
		}
		if(count == 0)
			System.out.println("\n\n=============draw=============");
	}
}
