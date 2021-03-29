
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
     * Fill the array with Minion names
     *
     * 
     */
    public void fillArray()
    {
        minionNames = new String[MINIONS];
        // name the minions - they will be given proper names later
        minionNames[0] = "Vulgar Homunculus";
        minionNames[1] = "Wrath Weaver";
        minionNames[2] = "Refreshing Anomaly";
        minionNames[3] = "Micro Machine";
        minionNames[4] = "Alleycat";
        minionNames[5] = "Rockpool Hunter";
        minionNames[6] = "Scallywag";
        minionNames[7] = "Kindly Grandmother";
        minionNames[8] = "Rabid Saurolisk";
        minionNames[9] = "Imprisoner";
        minionNames[10] = "Glyph Guardian";
        minionNames[11] = "Molten Rock";
        minionNames[12] = "Harvest Golem";
        minionNames[13] = "Unstable Ghoul";
        minionNames[14] = "Manchester Baby";
        minionNames[15] = "EEEEEEEEEEEEEEEEE";
        minionNames[16] = "My Magic Monkey Friend";
        minionNames[17] = "Imp Gang Boss";
        minionNames[18] = "CEO of Antifa";
        minionNames[19] = "Hangry Dragon";
        
        
    }
    
    public String[] getNames()
    {
        return minionNames;
    }
}
