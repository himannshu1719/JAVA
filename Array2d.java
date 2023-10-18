import java.util.Scanner;

public class Array2d
 {
    public static void main(String[] args) 
    {
        int max=0;
        Scanner sc = new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for( int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]>max)
                {
                max=arr[i][j];
                }
            }
        }
        System.out.println(" number is"+max);
    }
    
}
