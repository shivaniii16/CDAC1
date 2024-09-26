import java.util.Scanner;
public class ArmstrongNumber {
   public static boolean isArmstrong(int num){
      int original  = num ;
      int sum = 0 ;
      int n = String.valueOf(num).length();
  
      while (num != 0){
         int digit = num % 10; 
         sum += Math.pow(digit,n);
         num /=10;
      }
  return sum == original;
    } 
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number : " );
    int num = sc.nextInt();
    System.out.println(isArmstrong(num));
     sc.close();
   } 
  }
