import java .util.*;

public class patternplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values in the form of n");
        int n=sc.nextInt();
        for (int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                if( i==n/2|| j==n/2){
                    System.out.print("+ ");
                
                }
                else;
                    System.out.print("  ");

                     
            }
            System.out.println();
        }

    }
    
}
