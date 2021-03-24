
/**
 * Creates and returns a list of possible minion names to go on a card
 *
 * @author James McKenzie
 * @version 25/03/2021
 */
public class Minions
{
    // Fields
    private String[] minionNames;
    private final int MINIONS = 20;
    

    /**
     * Constructor for objects of class Minions
     */
    public Minions()
    {
        // Fill on creation
        this.fillArray();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fillArray()
    {
        minionNames = new String[MINIONS];
        // name the minions - they will be given proper names later
        minionNames[0] = "Minion 1";
        minionNames[1] = "Minion 2";
        minionNames[2] = "Minion 3";
        minionNames[3] = "Minion 4";
        minionNames[4] = "Minion 5";
        minionNames[5] = "Minion 6";
        minionNames[6] = "Minion 7";
        minionNames[7] = "Minion 8";
        minionNames[8] = "Minion 9";
        minionNames[9] = "Minion 10";
        minionNames[10] = "Minion 11";
        minionNames[11] = "Minion 12";
        minionNames[12] = "Minion 13";
        minionNames[13] = "Minion 14";
        minionNames[14] = "Minion 15";
        minionNames[15] = "Minion 16";
        minionNames[16] = "Minion 17";
        minionNames[17] = "Minion 18";
        minionNames[18] = "Minion 19";
        minionNames[19] = "Minion 20";
        
        
    }
    
    public String[] getNames()
    {
        return minionNames;
    }
}
