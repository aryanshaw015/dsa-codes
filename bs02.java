public class bs02{
    public static void main(String[] args){
        //int[]arr={109,90,80,76,65,54,43,32,21,12,10,0,-10};
        int[]arr={0,1,2,2,3,4,5,70,109,809,1009,20099};
        int ans=orderagnosticbs(arr,2);
        System.out.println(ans);
    }
    //binary search for sorted arrays and returninng their index (orderagnostic means if we dont the order of the array thats why we have checked the array that is it ascending or descending)
    static int orderagnosticbs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            boolean isAsc=arr[start]<arr[end];
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}