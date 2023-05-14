import java.util.Arrays;

public class Q7 {
    public static void main(String[] args){
        int[] arr={12,12,14,12,14,13};
        int max=arr[0];
        int min=arr[0];
        int c1=0,c2=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max){
                c1++;
            }
            if(arr[i]==min){
                c2++;
            }
        }
        System.out.println("Maximun element of array is "+max+" and occurs "+c1+" times ");
        System.out.println("Minimum element of array is "+min+" and occurs "+c2+" times ");

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                System.out.println("First ocurence of maximum element is at position "+(i+1));
                break;
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==min){
                System.out.println("Last occurence of minimum element is at position "+(i+1));
                break;
            }
        }

    }
    
}
