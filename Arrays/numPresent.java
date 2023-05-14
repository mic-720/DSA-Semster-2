import java.util.Scanner;
public class numPresent{
    public static int[] makeFrequencyArrayy(int[] arr){
        int[] freq=new int[100010];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arr={5,6,5,400,560,1000,400};
        int[] freq=makeFrequencyArrayy(arr);
        System.out.print("Enter number of queries : ");
        int q=s.nextInt();
        while(q>0){
            System.out.print("Enter number to be searched : ");
            int x=s.nextInt();
            if(freq[x]>0){
                System.out.println ("Present ");
            }
            else{
                System.out.println("Not Present ");
            }
            q--;
        }
    }
}
