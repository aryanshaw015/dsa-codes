
//searching in 2d arrays
import java.util.*;
public class ls08{
	public static void main(String []args){
		int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
		int target=8;
		int[] ans=linearsearch(nums,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] linearsearch(int[][]arr,int target){
		if(arr.length==0){
			return new int[]{-1,-1};
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){	
				int e=arr[i][j];
				if(e==target){
				    return new int[]{i,j};
			    }
            }
        }
		return new int[]{-1,-1};
	}
}
