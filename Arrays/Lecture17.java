import java.util.Scanner;
import java.util.Arrays;                  
public class Lecture17{
    public static int[] reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] makeFrequencyArray(int[] arr){
        int[] freq=new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static int[] rotate(int[] arr , int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;

    }
    public static int[] reverseIndex(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return arr;
    }
    public static int[] rotateNoSpace(int[] arr,int k){
        int n=arr.length;
        reverseIndex(arr, 0, n-k-1);
        reverseIndex(arr, n-k, n-1);
        reverseIndex(arr, 0, n-1);
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(rotateNoSpace(arr,2)));
        

    }
}