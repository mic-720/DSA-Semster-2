import java.util.Scanner;
public class Q5 {
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
			if(n==0) {
				n=sum;
				sum=0;
				if(n<10) {
				     break;
				}
			}
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		System.out.println("Sum of digits of "+n+" until the number is a single digit is : "+sum_Of_Digits(n));
	}
}
