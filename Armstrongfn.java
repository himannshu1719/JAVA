import java.util.Scanner;

public class Armstrongfn
 {  
     static int counter(int c)
    {
        int count=0;
        while(c>0)
        {
        c=c/10;
        count++; 
        
        }
                
       return count;
       }
    static void armstrong(int d)
    {  
        int n=d;
        int arm=0;
        int count=counter(n);
        while(d>0)
        {
        int b=d%10;
        arm=arm + (int)Math.pow(b,count);
        d=d/10;
        }
        if(arm==n)
        System.out.println(arm+" this numbeer is armstrong  ");
        else
        System.out.println(" not a armstrong number");
        }
    

    public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int a= sc.nextInt();
        armstrong(a);

    }
}
