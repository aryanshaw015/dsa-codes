//peak inddex of a mountain array

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class bsq6 {
    public static void main(String[] args){
        int[] arr={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[]arr){
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
        return end ; //or you can return start also but we cannot return mid as mid will have one less index as it terminates the loop beforehand only
    }
}
