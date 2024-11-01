package Model;
import java.util.ArrayList;

/**
 * Write a description of class LP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LP
{
    private ArrayList<Copy> collectionOfCopy;
    private int barcode;
    private String title;
    private String artist;
    private String publicationDate;
    /**
     * Constructor for objects of class LP
     */
    public LP(int barcode, String title, String artist, String publicationDate)
    {
        this.collectionOfCopy = new ArrayList<>();
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        
        
        
    }
    
    public Copy findCopyBySerialNumber(int serialNumber)
    {
        int index = 0;
        boolean isFound = false;
        Copy currentCopy = null;
        
        while(index < collectionOfCopy.size() && isFound == false)
        {
            currentCopy = collectionOfCopy.get(index);
            
            if(currentCopy.equals(serialNumber))
            {
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
