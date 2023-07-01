import java.util.Scanner;
import java.util.Random;

class NumGuessGame

{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = 0;
            randNum = rand.nextInt(30);
            
            int guess = -1;
            int tries = 0;
            
            while(guess != randNum)
            {
                System.out.print("Guess a number between 1 and 100:  ");
                guess = reader.nextInt();
                tries++;
                System.out.print(randNum);

                if(guess == randNum)
                {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries + " guesses!");
                    System.out.println("Would you like to play again? YES or NO: ");
                    play = reader.next().toLowerCase();
                }
                else if (guess > randNum)
                {
                    System.out.println(" Your guess is too high,try again.");
                }
                else 
                { 
                    System.out.println(" Your guess is too low, try again.");
                }
            }

        }

        reader.close();
    }
}