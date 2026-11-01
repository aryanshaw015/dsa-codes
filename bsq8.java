//this question is the subsitute of the question 8 
//to find the pivot of the sorted array (no duplictae items)
public class bsq8 {
    public static void main(String[]args){
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));    
    }
    static int findpivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //it comprises of 4 cases
            int mid=start+(end-start)/2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]) //here we have added and as it may happen that the last element of the array is the mid element at that time this wil throw an exception as mid+1 doesnt exist so to prevent that we have provided an extra constraint
                return mid;
            //case 2
            else if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            //case 3
            else if(arr[mid] <= arr[start])
                end=mid-1; //we are doing mid-1 as if it would have been mid elemnt then it would have come in first two cases
            //case 4
            else
                start=mid+1;//we are doing mid+1 as if it would have been mid elemnt then it would have come in first two cases
            }
        return -1;
    }
    
}
