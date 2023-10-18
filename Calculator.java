import java.util.Scanner;


public class Calculator
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("ENTER 1 FOR SUM\n 2 FOR SUBTRACT \n 3 FOR DIVIDE \n 4 FOR MULTIPLY\n 5 FOR MODULOUS");
    int a= sc.nextInt();
    System.out.println("enter first number");
    int n1=sc.nextInt();
    System.out.println(" enter seconf number");
    int n2=sc.nextInt();
    System.out.println(" RESULT IS ");
    switch(a)
    {
        case 1: 
        System.out.println(n1+n2);
        break;
        case 2:
        System.out.println(n1-n2);
        break;
        case 3:
        System.out.println(n1/n2);
        break;
        case 4:
        System.out.println(n1*n2);
        break;
        case 5:
        System.out.println(n1%n2);
        break;
        default:
        System.out.println("enter correct option");
    }
    }
}
