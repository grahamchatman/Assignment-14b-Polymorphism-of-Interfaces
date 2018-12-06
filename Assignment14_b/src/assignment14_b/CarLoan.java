
package assignment14_b;

public class CarLoan implements iMailable
{
    private String name;
    private double amountOwed;
    private double rate;
    private double monthlyPayment;
    
    
    public CarLoan(String name, double amountOwed, double rate, double monthlyPayment)
    {
        this.name = name;
        this.amountOwed = amountOwed;
        this.rate = rate;
        this.monthlyPayment = monthlyPayment;
                
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAmountOwed(double amountOwed)
    {
        this.amountOwed = amountOwed;
    }
    
    public double getAmountOwed()
    {
        return amountOwed;
    }
    
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    
    public double getRate()
    {
        return rate;
    }
    
    public void setMonthlyPayment(double monthlyPayment)
    {
        this.monthlyPayment = monthlyPayment;
    }
    
    public double getMonthlyPayment()
    {
        return monthlyPayment;
    }
    
    @Override
    public void printStatement()
    {
        System.out.println("Hello " + name + ", The amount still owed on your loan is: $" + amountOwed);
        System.out.println("Your interest rate is: %" + rate );
        System.out.println("Your monthly payments are: $" + monthlyPayment);
    }
}
