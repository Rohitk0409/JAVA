import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number");
    int a = sc.nextInt();
    System.out.println("Enter your second number");
    int b = sc.nextInt();
    int c = a + b;
    int f = a - b;
    int d = a * b;
    int e = a / b;
    System.out.println("Total sum =" + c);
    System.out.println("Substraction=" + f);
    System.out.println("Multiply=" + d);
    System.out.println("division=" + e);

  }

}
