package application;
import model.LPContainer;
import model.Copy;


/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController
{
    private LPContainer containerOfLP;
    
    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        this.containerOfLP = LPContainer.getInstance();
    }
    
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        return containerOfLP.findCopyBySerialNumber(serialNumber);
    }
}
