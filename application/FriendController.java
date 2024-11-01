package application;
import model.FriendContainer;
import model.Friend;



/**
 * Write a description of class FriendController here.
 *
 * @author (Nanna Mia Hansen & Lumière Schack)
 * @version (01.11.2024 kl. 11.13)
 */
public class FriendController
{
    private FriendContainer friendContainer;
    private Friend friend;
    
    /**
     * Constructor for objects of class FriendController
     */
    public FriendController()
    {
        friendContainer = FriendContainer.getInstance();
        
    }
    
    public Friend findFriendByPhoneNumber (String phoneNumber)
    {
        return friendContainer.findFriendByPhoneNumber (phoneNumber);
    }
}
