package application;
import model.Loan;
import model.LoanContainer;
import model.Copy;
import model.Friend;


/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    private LoanContainer loanContainer;
    private Loan loanOfLP;
    private LPController lpController;
    private FriendController friendController;
    private Copy copyOfLP;
    private Friend loanerFriend;
    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        lpController = new LPController();
        friendController = new FriendController();
        loanContainer = LoanContainer.getInstance();
    }
    
    public Loan makeNewLoan()
    {
        loanOfLP = new Loan();
        return loanOfLP;
    }
    
    public Copy findCopyBySerial(int serialNumber)
    {
     copyOfLP = lpController.findCopyBySerialNumber(serialNumber);
     return copyOfLP;
    }
    
    public void addCopy()
    {
        loanOfLP.setCopy(copyOfLP);
    }
    
    public Friend findFriendByPhoneNumber(String phoneNumber)
    {
        loanerFriend = friendController.findFriendByPhoneNumber(phoneNumber);
        return loanerFriend;
    }
    
    public void addFriend()
    {
        loanOfLP.setFriend(loanerFriend);   
    }
    
    public void confirmLoan()
    {
        loanContainer.addLoan(loanOfLP);
    }
}
