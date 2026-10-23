import java.util.Scanner;
public class lec11_02{
    public static void main(String  [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ar[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("transpose of the matrix is:");
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }
}

