//for integers
//search the target and return the index
public class ls01{
	public static void main(String []args){
		int[] nums={10,19,10,7,17,12};
		int target=19;
		int ans=linearsearch(nums,target);
		System.out.println(ans);
	}
	static int linearsearch(int[]arr,int target){
		if(arr.length==0){
			return -1;
		}
		for(int i=0;i<arr.length;i++){
			int e=arr[i];
			if(e==target){
				return i;
			}
		}
		return -1;
	}
}