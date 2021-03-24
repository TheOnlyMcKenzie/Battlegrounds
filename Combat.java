import java.util.ArrayList; // import the ArrayList class
/**
 * Write a description of class Combat here.
 *
 * @author James McKenzie
 * @version 25/03/21
 */
public class Combat
{
    // Make two warbands
    private ArrayList<Card> opponent = new ArrayList<Card>();
    private ArrayList<Card> player = new  ArrayList<Card>();
    private final int MAXATTACK = 128;
    private final int MAXHEALTH = 128;
    
    

    /**
     * Constructor for objects of class Combat
     */
    public Combat()
    {
        // Populate on creation
        this.populateOpponent();
        this.populatePlayer();
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
            opponent.add(new Card(name, attackValue, health));
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
            player.add(new Card(name, attackValue, health));
        } while (player.size() <= 7);
    }
    
    /**
     * Choosing attacker and defender randomly
     */
    public void battle()
    {
        int first;
        Card attacker;
        Card defender;
        
            // Determine who attacks first
            if (opponent.size() > player.size())
            {
                first = 0;
            }
            else if (player.size() > opponent.size())
            {
                first = 1;
            }
        // Need to set this inside a var, idk it didnt work otherwise
            
        int attackerIdx = (int) (Math.random() * opponent.size());
        int defenderIdx = (int) (Math.random() * player.size());
            
        attacker = opponent.get(attackerIdx);
        defender = player.get(defenderIdx);
            
            // Get attack and deal to enemy
            int attackAmt = attacker.getAttack();
            
            defender.takeDamage(attackAmt); // Deal attack
            
            
            // Defender attack back
            attacker.takeDamage(defender.getAttack());
            
            
        
    } 
    
    public static void main(String[] args)
    {
        Combat c = new Combat();
        c.battle();
    }
}
