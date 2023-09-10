
import java.util.Scanner;

class tempConverter {
  public static void main(String[] args) {
    double temp;
    double far;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a temperature in Celsius: " );
    temp = in.nextInt();
    System.out.println("That would be " + temp + " degrees Celsius");
    System.out.println("Calculating...");
    far = (temp  * 9);
    far = (far / 5);
    far = (far + 32);
    System.out.println("That would be " + far + " degrees Farenheit");
  }
}