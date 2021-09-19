package Lab2Question2CurrencyDenomination;

import java.util.Scanner;

public class CurrencyDenomination {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Size of Denominations ");
		int sizeDenominations = in.nextInt();

		int[] notesDenominations = new int[sizeDenominations];

		System.out.println("Enter the Array Denominations ");

		for (int i=0; i< sizeDenominations; i++) {
			notesDenominations[i] = in.nextInt();
		}

		System.out.println("Enter the Amount :");
		int amount = in.nextInt();

		in.close();

		MergeSort mrgSort = new MergeSort();
		mrgSort.sort(notesDenominations, 0, notesDenominations.length-1);

		Denomination amountDenos = new Denomination();
		amountDenos.NotesDenomination(notesDenominations, amount);

	}

}
