package Lab2Question1AchieveTarget;

public class Target {
	
	public void PayMoney(int[] arr, int targetNum, int targetVal) {
		boolean targetAchieved = false;
		int arrTot=0;
		int arrTimes=0;
		
		for(int i=0; i<arr.length-1; i++) {
			arrTot += arr[i];
			if(arrTot >= targetVal) {
				targetAchieved=true;
				arrTimes = i+1;
				break;
			}
		}
		
		if(targetAchieved == false) {
			System.out.println("Target Not Achieved");
		}
		else
		{
			System.out.println("Target Achieved in " + arrTimes + " Transactions \n");
		}
	}

}
