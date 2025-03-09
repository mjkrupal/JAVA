class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException()
    {
        super();
    }
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class Bank1
{
    String acno,custName;
    double balance;
    public Bank1(String acno, String custName, double balance)
    {
        this.acno = acno;
        this.custName = custName;
        this.balance = balance;
    }
    public void displayCustInfo()
    {
        System.out.println("Acn0 => "+acno);
        System.out.println("Cust Name => "+custName);
        System.out.println("Balance => "+balance);
    }
    public void withdraw(double amt) throws InsufficientBalanceException
    {
        if(balance-amt < 500)
            throw new InsufficientBalanceException("Minimum of 500 to be maintain in an account");
        balance = balance-amt; 
    }
    public static void main(String args[])
    {
        Bank1 cust1 = new Bank1("32682210001421","Rajesh",5000);
        cust1.displayCustInfo();
        try
        {
            cust1.withdraw(4600);
        }
        catch(InsufficientBalanceException ie)
        {
            System.out.println(ie);
        }
        finally
        {
            System.out.println("Executed finally block");
        }
        cust1.displayCustInfo();
    }
}