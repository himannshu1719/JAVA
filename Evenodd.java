import java.util.Scanner;

public class Evenodd 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the starting number");
        int start = sc.nextInt();
        System.out.println(" enter the last number");
        int end= sc.nextInt();
        for(int i = start; i<= end; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
