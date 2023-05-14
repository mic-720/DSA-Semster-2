import java.util.Scanner;
public class Q6 {
	public static boolean isOdd(int n) {
		if((n & 1)==1){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		System.out.println(n+" is odd : "+isOdd(n));
		
	}
}
