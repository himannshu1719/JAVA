import java.util.Scanner;

public class Discount 

{
     public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price");
        float price = sc.nextFloat();
        if(price<5000)
        {
            System.out.println("discount = 5%");
        }
        else if(price<10000)
        {
            System.out.println("discount =10%");
        }
        else if(price<20000)
        {
            System.out.println(" discount =15%");
        }
        else
        {
            System.out.println("discount =25%");
        }
    }
}
