// Home work find second smallest number 
public class Lecture16{
    public static int pairSum(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){          //first number 
            for(int j=i+1;j<arr.length;j++){    //Second number 
                if((arr[i]+arr[j])==target){
                    count++;
                }
            }
        }
        return count;

    }

    public static int tripletSum(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){           
            for(int j=i+1;j<arr.length;j++){    
                for(int k=i+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static int findUnique(int[] arr){         
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                return arr[i];
            }
        }
        return -1;
        
    }

    public static int maxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                if(arr[i]>smax){
                    smax=arr[i];

                }
            }
        }
        return smax;
    }

    public static int secondLargestt(int[] arr){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax){
                smax=arr[i];
            }
        }
        return smax;
    }
    public static int firstRepeat(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int lastRepeat(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                }
            }
        }
        return ans;
    }
    public static int secondMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args){
        int[] arr={1,5,3,4,6,3,4,6};
        int[] arr1={1,2,4,6,7};
        System.out.println(secondMin(arr));
        
    }
}