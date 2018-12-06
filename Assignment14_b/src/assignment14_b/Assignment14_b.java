
package assignment14_b;
public class Assignment14_b 
{

    public static void main(String[] args) 
    {
        Account account1 = new Account ("Graham" , 10000);
        CarLoan carLoan1 = new CarLoan ("Graham" , 2000 , 10 , 300);
        
        
        iMailable [] statement = new iMailable [2];
        statement[0] = account1;
        statement[1] = carLoan1;
        
        for(int i = 0; i < statement.length; i ++)
        {
            statement[i].printStatement();
        }
    }
    
}
