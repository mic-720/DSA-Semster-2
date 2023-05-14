import java.util.Arrays;

public class SecondLargest{
    public static int secondLargest(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int max=arr[arr.length-1];
        int smax=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=max){
                smax=arr[i];
                break;
            }
        } 
        return smax;

    }
    public static int secondLargestt(int[] arr){
        int max=arr[0];
        int smax=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i]; 
            }
            else if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        }
        return smax;
    }
    public static int secondLargesttt(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        System.out.println(secondLargest(arr));       
    }
}