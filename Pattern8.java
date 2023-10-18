import java.util.Scanner;

public class Pattern8 
{
public static void main(String[] args)
 {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int num = 1;
                for (int k = 0; k <= n-i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
}

