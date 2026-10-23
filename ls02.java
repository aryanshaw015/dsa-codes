//search the target and return the element
public class ls02{
	public static void main(String []args){
		int[] nums={};
		int target=80;
		int ans=linearsearch(nums,target);
		System.out.println(ans);
	}
	static int linearsearch(int[]arr,int target){
		if(arr.length==0){
			return Integer.MAX_VALUE;
		}
		for(int i=0;i<arr.length;i++){
			int e=arr[i];
			if(e==target){
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
}
