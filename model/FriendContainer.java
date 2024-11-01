package model;
import java.util.ArrayList;


/**
 * Write a description of class FriendContainer here.
 *
 * @author (Nanna Mia Hansen & Lumière Schack)
 * @version (01.11.2024 kl. 9.42)
 */
public class FriendContainer
{
    private ArrayList<Friend> friendCollection;
    private static FriendContainer instance;
    
    /**
     * Constructor for objects of class FriendContainer
     */
    private FriendContainer()
    {
        friendCollection = new ArrayList<>();
        
    }
    
    public static FriendContainer getInstance()
    {
        if(instance == null) 
        {
              instance = new FriendContainer();
        }
        return instance;
    }
    
    public Friend findFriendByPhoneNumber (String phoneNumber)
    {
        int index = 0;
        boolean searching = true;
        
        while(searching && index < friendCollection.size())
        {
            Friend currentFriend = friendCollection.get(index);
            String friendPhoneNumber = currentFriend.getPhoneNumber();
            if(friendPhoneNumber.equals(phoneNumber))
            {
                searching = false;
            }
            else
            {
                index = index + 1;
            }
        }
        
        if(searching)
        {
            return null;
        }
        else
        {
            return friendCollection.get(index);
        }
    }
}
