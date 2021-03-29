
/**
 * Driver class
 * Runs the combat sequence 10,000 times and returns stats on the probability of the player winning
 *
 * @author James McKenzie
 * @version 30/03/2021
 */
public class Simulate
{
    public static void main(String[] args)
    {
        // Set up variables to record the wins, losses and draws
        int wins = 0, losses = 0, draws = 0;
        
        
        // Create and display the warbands
        Combat c = new Combat();
        
        // Run the warbands through the battle sequence 10,000 times
        // Record the number of wins, losses, and draws
        for (int i = 0; i < 10000; i++)
        {
            c.battle();
            if (c.battle() == 0)
            {
                losses++;
            }
            
            if (c.battle() == 1)
            {
                wins++;
            }
            
            if (c.battle() == 2)
            {
                draws++;
            }
        }
        
        // Print the results
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }
}
