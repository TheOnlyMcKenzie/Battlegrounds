import java.util.ArrayList; // import the ArrayList class
/**
 * Write a description of class Combat here.
 *
 * @author James McKenzie
 * @version 26/03/21
 */
public class Combat
{
    // Make two warbands
    private ArrayList<Card> opponent = new ArrayList<Card>();
    private ArrayList<Card> player = new  ArrayList<Card>();
    // Set the max attack and health values
    private final int MAXATTACK = 128;
    private final int MAXHEALTH = 128;
    
    

    /**
     * Constructor for objects of class Combat
     */
    public Combat()
    {
        // Populate on creation
        this.populatePlayer();
        this.populateOpponent();
    }

    /**
     * Fill in the warbands
     *
     * 
     */
    public void populateOpponent()
    {
        String[] names;
        String name;
        int attackValue;
        int health;
        do
        {
            Minions nameList = new Minions();
            names = nameList.getNames();
            name = names[(int) ((Math.random() * names.length) +1)];
            attackValue = (int) ((Math.random() * MAXATTACK) + 1);
            health = (int) ((Math.random() * MAXHEALTH) + 1);
            Card card = new Card(name, attackValue, health);
            System.out.print(card);
            opponent.add(card);
        } while (opponent.size() <= 7);
    }
    
    public void populatePlayer()
    {
        String[] names;
        String name;
        int attackValue;
        int health;
        do
        {
            Minions nameList = new Minions();
            names = nameList.getNames();
            name = names[(int) ((Math.random() * names.length) +1)];
            attackValue = (int) ((Math.random() * MAXATTACK) + 1);
            health = (int) ((Math.random() * MAXHEALTH) + 1);
            Card card = new Card(name, attackValue, health);
            System.out.print(card);
            player.add(card);
        } while (player.size() <= 7);
    }
    
    /**
     * Choosing attacker and defender randomly
     */
    public void battle()
    {
        
        int first = 0;
        Card attacker;
        Card defender;
        int attackerIdx;
        int defenderIdx;
        int attackAmt;
        boolean noMinions = false;
        
        
        while (noMinions == false)
        {
            
            // Determine who attacks first
            if (opponent.size() > player.size())
            {
                first = 1;
            }
            else if (player.size() > opponent.size())
            {
                first = 2;
            }
            else if (player.size() == opponent.size())
            {
                first = (int) (1 + Math.random() * 2);
            }
            
            // If opponent attacks first
            if (first <= 1)
            {
                for (int i = 0; i < opponent.size(); i++)
                {
                    attacker = opponent.get(i);
                    defenderIdx = (int) (Math.random() * player.size());
                    defender = player.get(defenderIdx);
                    
                    // Get attack and deal to defender
                    attackAmt = attacker.getAttack();
                    
                    defender.takeDamage(attackAmt); // Deal attack
                    
                    // Defender attack back (only if it hasn't been killed already though)
                    if (defender.isActive())
                        attacker.takeDamage(defender.getAttack());
                    
                    // Check if cards are active
                    if (!attacker.isActive())
                    {
                       opponent.remove(attacker); 
                    }
                    
                    if (!defender.isActive())
                    {
                       player.remove(defender); 
                    }
                }
            }
            // If player attacks first
            if (first > 1)
            {
               for (int i = 0; i < player.size(); i++)
                {
                    attacker = player.get(i);
                    defenderIdx = (int) (Math.random() * opponent.size());
                    defender = opponent.get(defenderIdx);
                    
                    // Get attack and deal to defender
                    attackAmt = attacker.getAttack();
                    
                    defender.takeDamage(attackAmt); // Deal attack
                    
                    // Defender attack back (only if it hasn't been killed already though)
                    if (defender.isActive())
                        attacker.takeDamage(defender.getAttack());
                    
                    // Check if cards are active
                    if (!attacker.isActive())
                    {
                       player.remove(attacker); 
                    }
                    
                    if (!defender.isActive())
                    {
                       opponent.remove(defender); 
                    }
                } 
            }
            
            // Check the winner
            if (player.size() == 0 && opponent.size() != 0)
            {
               noMinions = true; 
            }
            
            
        }
    } 
    
    public static void main(String[] args)
    {
        Combat c = new Combat();
        c.battle();
    }
}
