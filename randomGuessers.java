/*The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this:

I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
To choose a random number, you can use the Random class in java.util
Like the Scanner class in this chapter, Random has to be imported before we can use it. And as with Scanner, we have to use the new operator to create a Random (number generator).

Then we can use the method nextInt to generate a random number. In this example, the result of nextInt(100) will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.

The definition of GuessStarter is in a file called GuessStarter.java, in the directory called ch03, in the repository for this book.
Compile and run this program.
Modify the program to prompt the user; then use a Scanner to read a line of user input. Compile and test the program.
Read the user input as an integer and display the result. Again, compile and test.
Compute and display the difference between the user’s guess and the number that was generated.
*/
import java.util.Scanner;
import java.util.Random;

class randomGuesser {
  public static void main(String[] args) {
    int guess;
    int num;
    int dif;
    Scanner in = new Scanner(System.in);

    Random random = new Random();
        num = random.nextInt(100) + 1;

    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.println("Your guess is " + guess);
    System.out.println("The number I was thinking was " + num);
    dif = Math.abs(guess - num);
    System.out.println("You were off by " + dif);
  }
}