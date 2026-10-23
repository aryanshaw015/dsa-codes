//search the target and return true or false
public class ls03{
	public static void main(String []args){
		int[] nums={10,19,10,7,17,12};
		int target=29;
		boolean ans=linearsearch(nums,target);
		System.out.println(ans);
	}
	static boolean linearsearch(int[]arr,int target){
		if(arr.length==0){
			return false;
		}
		for(int i=0;i<arr.length;i++){
			int e=arr[i];
			if(e==target){
				return true;
			}
		}
		return false;
	}
}