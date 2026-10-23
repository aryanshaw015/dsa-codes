//searching maximum value in 2d array
import java.util.*;
public class ls09{
	public static void main(String []args){
		int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
		int ans=linearsearch(nums);
		System.out.println(ans);
	}
	static int linearsearch(int[][]arr){
		int e=Integer.MIN_VALUE;
		if(arr.length==0){
			return Integer.MIN_VALUE;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){	
				if(e<arr[i][j]){
					e=arr[i][j];
			    	}
            		}
        	}
		return e;
	}
}