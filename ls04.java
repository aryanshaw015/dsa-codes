
//from string
//search the target and return true or false
public class ls04{
	public static void main(String []args){
		String s="AryanShaw";
		char target='m';
		boolean ans=linearsearch(s,target);
		System.out.println(ans);
	}
	static boolean linearsearch(String s,int target){
		if(s.length()==0){
			return false;
		}
		
		for(int i=0;i<s.length();i++){
			char e=s.charAt(i);
			if(e==target){
				return true;
			}
		}
		return false;
	}
}
