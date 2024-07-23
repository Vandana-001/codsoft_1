import java.util.*;
public class NumberGame
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int number=ran.nextInt(100)+1;
        int attempt=1,guess;
        System.out.println("Welcome to the Number Game!");
        System.out.println("I am thinking of a number between 0 and 100. Can you guess what it is?");
        System.out.println("You have 10 attempts to guess the number.");
        while(attempt<=10)
        {
            System.out.println();
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            if(!(guess<=100 && guess>=1))
            {
                System.out.println("Enter a number between 1 and 100");
                continue;
            }
            if(guess==number)
            {
                System.out.println("Congratulations!You guessed the number!");
                break;
            }
            else if(guess>number)
            {
                System.out.println("Too high!");
                attempt++;
            }
            else{
                System.out.println("Too Low!");
                attempt++;
            }
            
        }
        if(attempt>10)
        {
            System.out.println("Sorry,you've run out of attempts. The number was"+ number +".");
        }
    }
}