import java.util.*;
// Play a Number Guessing Game
public class Randomno {
    public static void main(String args[])
    {
        Random n = new Random();
        int RandomNumber = n.nextInt(10);
        while(true) {
            System.out.println("Enter number between 1 to 10");
            Scanner sc = new Scanner(System.in);
            int Guess = sc.nextInt();
            if (RandomNumber == Guess) {
                System.out.println("YAY!!you guessed right");
                break;
            }
            else if (RandomNumber < Guess)
            {
                System.out.println("Guess a smaller number and try again");
            }

            else
            {
                System.out.println("Guess a greater number and Try Again");
            }
        }

    }
}