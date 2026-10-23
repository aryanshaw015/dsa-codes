//search and print  the minimum value from the aarray
public class ls07{
	public static void main(String []args){
		int[] nums={10,19,10,7,17,12};
		int ans=min(nums);
		System.out.println(ans);
	}
	static int min(int[]arr){
		int e=arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(e>arr[i]){
				e=arr[i];
			}
		}
		return e;
	}
}
