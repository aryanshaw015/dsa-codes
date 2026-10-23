import java.util.Scanner;
public class lec12_01 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        String ar[]= new String[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.next();
            a=a+ar[i].length();
        }
        System.out.println("commultattive length "+a);
        sc.close();
    }
    
}
