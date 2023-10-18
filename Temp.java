import java.util.Scanner;

public class Temp {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        float temp1 = ((temp * 9) / 5) + 32;
        System.out.println("temperatyre in fh= " + temp1);
    }
}
