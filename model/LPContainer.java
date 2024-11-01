package model;
import java.util.ArrayList;


/**
 * Write a description of class LPContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer
{
    private ArrayList<LP> collectionOfLP;
    private static LPContainer instance;
    /**
     * Constructor for objects of class LPContainer
     */
    private LPContainer()
    {
        this.collectionOfLP = new ArrayList<>();
        
    }
    
    public static LPContainer getInstance()
    {
        if (instance == null)
        {
            instance = new LPContainer();
        }
        return instance;
    }
    
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        int index = 0;
        boolean isFound = false;
        Copy currentCopy = null;
        LP currentLP = null;
        
        while(index < collectionOfLP.size() && isFound == false)
        {
            currentLP = collectionOfLP.get(index);
            currentCopy = currentLP.findCopyBySerialNumber(serialNumber);
            
            if (currentCopy != null){
                isFound = true;
            }
            
            else
            {
               index = index + 1; 
            }
        }
        
        return currentCopy;
    }
    
}

