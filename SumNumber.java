import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second Number");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
         System.out.println("The sum of " + num1 + "and" + num2 +" is:" + sum);

         scanner.close();
    }

}
