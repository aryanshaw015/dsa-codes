import java.util.Scanner;
public class lec10_02 {
    public static void main(String[] args){
        Scanner tp=new Scanner(System.in);
        int s=tp.nextInt();
        int[] integers=new int[s];
        for(int i=0;i<s;i++){
            integers[i]=tp.nextInt();
        }
        int max=integers[0];int min=integers[0];
        for(int i=0;i<s;i++){
            if (integers[i]<min){
                min=integers[i];
            }
            if( integers[i]>max){
                max=integers[i];
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        tp.close();
    }    
}
