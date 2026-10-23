import java.util.Scanner;
public class lec12_03 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your email");
        String email=sc.next();
        String un="";
        for(int i=0;i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                un=un+email.charAt(i);
            }
        }
        System.out.println("username" +"\n"+un);
        sc.close();
    }
    
}
