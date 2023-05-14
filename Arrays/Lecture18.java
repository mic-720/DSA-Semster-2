import java.util.Arrays;

public class Lecture18 {
    /*public static int[] sort(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        return arr;
        
    }*/
    
    public static void main(String[] args){
        int[] arr={1,0,0,1,0,1,1,0,0};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
