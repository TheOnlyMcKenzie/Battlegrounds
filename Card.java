
/**
 * Write a description of class Card here.
 *
 * @author James McKenzie
 * @version 26/03/21
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String name;
    private int attack, life;

    /**
     * Constructor for objects of class Cat
     */
    public Card(String nm, int at, int hp)
    {
        name = nm;
        attack = at;
        life = hp;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isActive()
    {
        if (life <= 0)
            return false;
        return true;
    }
    
    public void takeDamage(int amt)
    {
        life -= amt;
    }
    
    public int getAttack()
    {
        return attack;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getLife()
    {
        return life;
    }
}
