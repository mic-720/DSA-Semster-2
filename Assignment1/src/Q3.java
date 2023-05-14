import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		int copy=n;
		int sum=0;
		int ans=1;
		while(n>0) {
			sum=sum+n%10;
			ans=ans*(n%10);
			n=n/10;
		}
		if(sum==ans) {
			System.out.println(copy+" is a spy number ");
		}
		
	}

}
