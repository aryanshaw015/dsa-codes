//search in range
//search the target and return the index
public class ls06{
	public static void main(String []args){
		int[] nums={10,19,10,7,17,12};
		int target=12;
		int ans=linearsearch(nums,target,1,4);
		System.out.println(ans);
	}
	static int linearsearch(int[]arr,int target,int start,int end){
		if(arr.length==0){
			return -1;
		}
		for(int i=start;i<=end;i++){
			int e=arr[i];
			if(e==target){
				return i;
			}
		}
		return -1;
	}
}