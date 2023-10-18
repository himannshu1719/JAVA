import java.util.Scanner;

public class Sumofdigits 
{
  public static void main(String[] args) {
    

    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number");
    int number= sc.nextInt();
    int temp;
    int sum=0;
    while(number>0)
    {   
        temp= number%10;
        sum=sum+temp;
        number=number/10;

    }
    System.out.println("sum is "+sum);
  }  
}
