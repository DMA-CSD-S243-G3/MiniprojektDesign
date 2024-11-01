package model;
import java.util.ArrayList;


/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    private ArrayList<Loan> collectionOfLoan;
    private static LoanContainer instance = new LoanContainer();
    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
       collectionOfLoan = new ArrayList<>(); 
    }
    
    public static LoanContainer getInstance()
    {
        return instance;    
    }
    
    public void addLoan(Loan newLoanOfLP)
    {
        collectionOfLoan.add(newLoanOfLP);
    }
}
