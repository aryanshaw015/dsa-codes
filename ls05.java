//alternate from previous one using for each loop(search the target and return true or false)
import java.util.*;
public class ls05{
	public static void main(String []args){
		String s="AryanShaw";
		char target='w';
		boolean ans=linearsearch(s,target);
		System.out.println(ans);
		System.out.println(Arrays.toString(s.toCharArray()));
	}
	static boolean linearsearch(String s,int target){
		if(s.length()==0){
			return false;
		}
		
		for(char ch: s.toCharArray()){
			if(ch==target){
				return true;
			}
		}
		return false;
	}
}
