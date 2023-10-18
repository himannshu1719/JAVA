import java.util.Scanner;

public class Bmi
 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight");
        float weight = sc.nextFloat();
        System.out.println("Enter height ");
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.println("BMI= " + BMI);

    }
    
}
