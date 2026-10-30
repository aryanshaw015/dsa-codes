class bs01 {
    public static void main(String[] args){
        int[]arr={-20,-18,-10,-3,0,1,5,6,9,10,16,27,78,109,2055};
        int ans=binarysearch(arr,78);
        System.out.println(ans);
    }
    //return the index if it does not exsist then return -1
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
