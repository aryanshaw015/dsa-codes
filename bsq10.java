//a varied question of bsq9 it is also to binary search in a rotated sorted array but with duplicate elements as well
public class bsq10 {
    public static void main(String[]args){
        int[] arr={9,9,9,10,2,3,9};
        int target=10;
        System.out.println(search(arr,target));
    }



    static int search(int[]arr,int target){
        int pivot=findpivot(arr);
        if(pivot==-1){ //if pivot is not found that means is not a rotated soorted array
            //just do normal binary search
            return binarysearch(arr,target,0,arr.length-1);
        }
        //when arr[pivot] itself is the target
        if(arr[pivot]==target){
            return pivot;
        }
        //if target is bigger than the starting element then it must lie in first half(ascending) of array
        if(target>=arr[0]){
            return binarysearch(arr,target,0,pivot-1);
        }
        //if target is smaller than the starting element then it must lie the second half(ascending) of the array
        return binarysearch(arr,target,pivot+1,arr.length-1);
    }

    


    static int binarysearch(int[]arr,int target,int start,int end){
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
