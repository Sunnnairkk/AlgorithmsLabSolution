package Lab2Question1AchieveTarget;

import java.util.Scanner;

public class AchieveTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Targets Array Size ");
		int sizeTargets = in.nextInt();
		
		System.out.println("Enter the Values of Targets ");
		int[] arrTargets = new int[sizeTargets];
		for(int i=0; i< sizeTargets; i++) {
			arrTargets[i] = in.nextInt();
		}
		
		System.out.println("Enter the Number of Targets to be Achieved ");
		int numOfTargetsToBeAchieved = in.nextInt();
		
		
		for(int i=0; i < numOfTargetsToBeAchieved; i++) {
			System.out.println("Enter the Value of Targets to be Achieved ");
			int valOfTargetsToBeAchieved = in.nextInt();

			Target targetAchieve = new Target();
			targetAchieve.PayMoney(arrTargets, numOfTargetsToBeAchieved, valOfTargetsToBeAchieved);
			
		}
		
		in.close();
		
		
	}

}
