package Model;


/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy
{
    private int serialNumber;
    private String purchaseDate;
    private String purchasePrice;
    private boolean isBorrowed;
    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, String purchasePrice, boolean isBorrowed)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.isBorrowed = isBorrowed;
    
        
    }
    
    public int getSerialNumber()
    {
        return this.serialNumber;
    }
    
    

}
