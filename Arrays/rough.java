import java.util.Arrays;

public class rough{
    public static boolean findTriplets(int arr[] , int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+""+arr[j]+arr[k]);
                        count++;
                    }
                }
            }
        }
        if(count>=1){
            return true;
        }
        return false;

    }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static isSortedd(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4,5,6};
        System.out.println(isSorted(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[j]){
                arr[j]=arr[j+1];
            }
        }
        System.out.println(Arrays.toString(arr));
       
    }
}