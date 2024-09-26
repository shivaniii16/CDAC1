import java.util.Scanner;
class Palindrome {
	public static void main (String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter The Number To Check If It's a Palindrome or Not..");
	int num = scan.nextInt();
	int Revnum = 0;
	int temp = num;
		while (temp !=0) {
		int digit = temp % 10;
		Revnum = Revnum *10 + digit;
		temp = temp/10;
	}
	if (num == Revnum) {
	System.out.println(" True ");
    		} else {
        System.out.println(" False");
	}
}
}
