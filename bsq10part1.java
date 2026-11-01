//find the pivot (this array contains duplicate items)
public class bsq10part1 {
    public static void main(String[]args){
        int[] arr={4,5,6,7,8,8,0,1,2};
        int pivot=findpivot(arr);
        System.out.println(arr[pivot]);    
    }
    static int findpivot(int[]arr){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                //it comprises of 5 cases in duplicate elements
                int mid=start+(end-start)/2;
                //case 1
                if(mid<end && arr[mid]>arr[mid+1]) //here we have added and as it may happen that the last element of the array is the mid element at that time this wil throw an exception as mid+1 doesnt exist so to prevent that we have provided an extra constraint
                    return mid;
                //case 2
                else if(mid>start && arr[mid]<arr[mid-1])
                    return mid-1;
                //case 3
                //if elemnts at middle end and start are same skip them
                else if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                    //skip the duplicates
                    // NOTE: what if these elements at start and end were the pivot??
                    // check if start is pivot
                    if(start<end && arr[start]>arr[start+1])
                        return start;
                    start++;
                    // check whether end is pivot
                    if (end > start && arr[end] < arr[end - 1]) 
                        return end - 1;
                    end--;    
                }
                // left side is sorted, so pivot should be in right(case 4)
                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) 
                    start = mid + 1;
                //case 5 (right side is covered and so pivot should be in left opp. of case 4)
                else 
                    end = mid - 1;
            }
            return -1;
    }
}