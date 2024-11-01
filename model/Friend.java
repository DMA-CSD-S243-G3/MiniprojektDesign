package model;


/**
 * Write a description of class Friend here.
 *
 * @author (Nanna Mia Hansen & Lumière Schack)
 * @version (01.11.2024 kl. 9.17)
 */
public class Friend
{   private String name;
    private String address;
    private int postalCode;
    private String city;
    private String phoneNumber;
    
    /**
     * Constructor for objects of class Friend
     */
    public Friend(String name, String address, int postalCode, String city,
                String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
