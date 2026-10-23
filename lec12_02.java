import java.util.Scanner;
public class lec12_02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                a=a+'i';
            }
            else{
                a=a+s.charAt(i);
            }
        }
        System.out.print(a);
        sc.close();
    }
    
}
