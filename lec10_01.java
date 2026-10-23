import java.util.*;
public class lec10_01 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String[] names= new String[s];
        for(int i=0;i<s;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<s;i++){
            System.out.println(names[i]);
        }
        sc.close();
    }    
}
