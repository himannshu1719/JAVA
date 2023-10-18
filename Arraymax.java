import java.util.Scanner;

public class Arraymax
 {
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);

     int arr[]=new int[5];
     for(int i=0;i<arr.length;i++)
{
    System.out.println("enter the"+(i+1)+ "value");
    int a=sc.nextInt();
    arr[i]=a;
}
int min =arr[0];
for(int i=0;i<arr.length;i++)
{
    if(min>arr[i])
    {
        min=arr[i];
    }
}
System.out.println(min+" is smallest");
    }
}
