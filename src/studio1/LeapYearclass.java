package studio1;
import java.util.Scanner;


public class LeapYearclass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Enter the Year: ");
		int year = in.nextInt();
		
		
		boolean leapYear = ((year%4 == 0) && (year%100 != 0) || (year%400 == 0));
		System.out.println(leapYear);
		
		System.out.println(year + " is a leap year: " + leapYear);
		

		
		
	}

}
