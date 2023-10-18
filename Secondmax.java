  import java.util.Scanner;

  public class Secondmax
  {
        
        public static void main(String[] args)
         {
           Scanner sc = new Scanner(System.in);
    
         int arr[]=new int[5];
         for(int i=0;i<arr.length;i++)
    {
        System.out.println("enter the "+(i+1)+ " value");
        int a=sc.nextInt();
        arr[i]=a;
    }
    int max =Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(max<arr[i])
        {  
            max=arr[i];
        }
    }

    for(int i=0;i<arr.length;i++)
    {
        if( smax<arr[i] && arr[i]!= max)
        smax=arr[i];
    }

    System.out.println(smax+" is second max");
        }
    }
     

