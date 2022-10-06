import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double costSquareFt, houseLength, houseWidth, houseHeight, numWin, winHeight, winLength, numDoor, doorHeight, doorLength, side, sidePeak, winSquareFt, houseNoWinODoor, doorSquareFt, totalPaintArea, howMuch;
		
		//Get all inputs
		System.out.print("Please enter the cost per square foot: ");
		costSquareFt = sc.nextDouble();
	
		System.out.print("Please enter the length of the house : ");
		houseLength = sc.nextDouble();
		
		System.out.print("Please enter the width of the house : ");
		houseWidth = sc.nextDouble();
		
		System.out.print("Please enter the height of the house : ");
		houseHeight = sc.nextDouble();
		
		System.out.print("Please enter the number of windows : ");
		numWin = sc.nextDouble();
		
		System.out.print("Please enter the length of a window : ");
		winHeight = sc.nextDouble();
		
		System.out.print("Please enter the width of a window : ");
		winLength = sc.nextDouble();
		
		System.out.print("Please enter the number of doors : ");
		numDoor = sc.nextDouble();
		
		System.out.print("Please enter the length of a door : ");
		doorHeight = sc.nextDouble();
		
		System.out.print("Please enter the width of a door : ");
		doorLength = sc.nextDouble();
		
		//Do all calculations 
		side = houseWidth * houseLength;
		
		sidePeak = houseWidth * houseLength + .5*(houseLength*(houseHeight-houseWidth));
		
		doorSquareFt = numDoor*(doorLength*doorHeight);
		
		winSquareFt = numWin*(winLength*winHeight);
		
		houseNoWinODoor = 2*(side + sidePeak);
		
		totalPaintArea = houseNoWinODoor-(doorSquareFt + winSquareFt);
		
		howMuch = totalPaintArea * costSquareFt;
		
		//Output
		String Area = String.format("%,.0f", totalPaintArea);
		System.out.println("Your total paintable surface area is: "+ Area +" square feet.");
		
		String estimate = String.format("%,.0f", howMuch);
		
		System.out.println("Your estimated is: "+ estimate + " dollars.");
		
		sc.close();
	

	}

}
