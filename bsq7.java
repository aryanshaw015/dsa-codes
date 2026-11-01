//find index of target in bitonic or mountain array
//https://leetcode.com/problems/find-in-mountain-array/
public class bsq7 {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,3,1};
        int target=3;
        int z=search(arr,target);

        System.out.println(z);
    }
    //firts step of the program to find peak element
    public static int findInMountainArray(int[]arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else
                start=mid+1;
            
        }
        return end ;
    }
    //second step of the program to do order agnostoic search as there will be both ascendig part and descendig part in the array
    public static int orderagnosticbs(int[]arr, int target,int start,int end){
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
    //the last step is to give directions to order agnostic bs search that if it has not found in the ffirst half that is ascending part then it need to search in descending part also which is secondhalf
    public static int search(int[]arr,int target){
        int peak=findInMountainArray(arr);
        int firsthalf=orderagnosticbs(arr,target,0,peak);
        if(firsthalf!=-1)
            return (firsthalf);
        return orderagnosticbs(arr,target,peak+1,arr.length-1);
    }  
}
