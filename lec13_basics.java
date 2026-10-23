import java.util.Scanner;
public class lec13_basics {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(1,'a');
        System.out.println(sb.charAt(0));
        System.out.println(sb);
        sb.insert(2,'z');
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.append("ijklmnop");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }   
}
