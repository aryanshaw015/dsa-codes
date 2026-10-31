//infine array saerching
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class bsq5 {
    public static void main(String[] args){
        int[]arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        int ans=findrange(arr,target);
        System.out.println(ans);
    }
    static int findrange(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return searching(arr,target,start,end);
    }
    static int searching(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;          
            else if(target<arr[mid])
                end=end-1;
            else
                return mid;
        }
        return -1;
    }
}
