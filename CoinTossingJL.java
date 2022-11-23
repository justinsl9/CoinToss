package cointossingjl;      //@author Justin Little
import java.util.Scanner;
import java.security.SecureRandom;

public class CoinTossingJL {

    private enum Coin{Heads, Tails}
    private static final int COIN_SIDES=2;
    
    public static void main(String[] args) 
    {
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int tails = 0, heads = 0;
        int coin;
        Coin coinflip;
        
        System.out.print("Do you want to toss the coin? (1 for yes or 2 for no): ");
        coin = input.nextInt();
        
        while (coin != 2)
        {
           int toss = randomNumbers.nextInt(COIN_SIDES);
           if (toss == 1) 
           {
               coinflip = Coin.Heads;
               System.out.println("The coin landed on " + coinflip + "!");
               heads++;
               System.out.println("Total times landed on Heads: " + heads);               
           }
           else 
           {
               coinflip = Coin.Tails;
               System.out.println("The coin landed on " + coinflip + "!");
               tails++;
               System.out.println("Total times landed on Tails: " + tails);             
           }
           
           System.out.print("Do you want to toss the coin? (1 for yes or 2 for no): ");
           coin = input.nextInt();
           
        }
        System.out.println("Game Over! Your coin is mine!");
    }
}
