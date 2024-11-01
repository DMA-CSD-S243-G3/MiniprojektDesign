package model;


/**
 * Class Loan - A loan of a LP.
 * 
 * The "Loan" represents the loan of a LP from the loaner's collection.
 * The 'Loan' holds data such as the loan number, the starting date of the loan,
 * the period of time for the loan, the state in terms of whether it is loaned out or not,
 * and which copy of the LP was loaned out along with which friend that loaned the copy.
 * 
 * @author Christoffer Søndergaard
 * @version 01/11/2024 - 09:17
 */
public class Loan
{
    private int loanNumber;
    
    private String borrowDate;
    private String period;
    private String state;
    
    private Copy copyLP;
    private Friend loanerFriend;
    
    
    /**
     * Creates a Loan object.
     */
    public Loan()
    {
        this.loanNumber = 0;
        
        this.borrowDate = "";
        this.period = "";
        this.state = "";
        
        this.copyLP = null;
        this.loanerFriend = null;
    }
    
    
    /**
     * Sets the copy of the LP that was loaned to be stored within the Loan object. 
     * @param Copy - The copy of the LP.
     */
    public void setCopy(Copy copyLP)
    {
        this.copyLP = copyLP;    
    }  
    
    /**
     * Sets the friend that loaned the LP to be stored within the Loan object. 
     * @param Friend - The friend that loaned the LP.
     */
    public void setFriend(Friend loanerFriend)
    {
        this.loanerFriend = loanerFriend;
    }
}
