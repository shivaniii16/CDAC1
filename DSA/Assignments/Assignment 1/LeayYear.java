import java.util.Scanner;
class LeapYear {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Year To Check If It's Leap Year Or Not..");
		int year = scan.nextInt();
		//System.out.println("The Year Is : "+year);
			if(year%4 == 0 || year%400 ==0){
		System.out.println("The Year "+year+" is a Leap Year");
		}	else{
		System.out.println("The Year "+year+ " is not a Leap Year");
		}
	
	}
}
