//Write a program that converts a total number of seconds to hours, minutes, and seconds. It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) use printf to display the output. For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".


import java.util.Scanner;

class secsToHourMin {
  public static void main(String[] args) {
    int secs;
    int mins;
    int hours;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number of seconds " );
    secs = in.nextInt();
    System.out.println("That would be " + secs + " seconds...");
    System.out.println("Calculating...");
    hours = secs / 3600;
    secs = secs - (hours*3600);
    mins = secs / 60;
    secs = secs - (mins*60);
    System.out.println("That would be " + hours + " hours, " + mins + " minutes, and " + secs + " seconds");
  }
}