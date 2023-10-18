import java.util.*;

public class Incometax 

{
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income");
        float salery = sc.nextFloat();
        if(salery<10000)
        {
            System.out.println(" no tax");
        }
        else if(salery<20000)
        {
            System.out.println("tax=20%");
        }
        else if(salery<30000)
        {
            System.out.println(" tax=15%");
        }
        else
        {
            System.out.println("tax=25%");
        }
    }
}
