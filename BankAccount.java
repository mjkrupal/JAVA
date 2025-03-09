import java.util.Scanner;
public class BankAccount
{
    //Properties
    String acno,custName;
    double balance;
    String branch;
    long mobile;
    
    public BankAccount()
    {
        System.out.println("Properties are initialized with default values");
    }

    public BankAccount(String accountNo, String customername,double amount, String branchName,long contact)
    {
        acno=accountNo;
        custName=customername;
        balance=amount;
        branch=branchName;
        mobile=contact;
    }

    public void displayCustomerInfo()
    {
        System.out.println("Customer Account Number: "+acno);
        System.out.println("Customer Name: "+custName);
        System.out.println("Balance Amount: "+balance);
        System.out.println("Branch Name: "+branch);
        System.out.println("Mobile Number: "+mobile);
    }
    
    public void deposit(double amt)
    {
        balance=balance+amt;
        System.out.println(amt+" is credited successfully into your bank account");
    }

    public void withdraw(double amt)
    {
        if(balance-amt < 500)
        {
            System.out.println("You should be maintain minimum of 500 as a balance");
        }else{
            balance=balance-amt;
            System.out.println(amt+" is debited successfully from your bank account");
        }
    }

    public double checkBalance()
    {
        return balance;
    }

    public static void main(String args[])
    {
        BankAccount cust1 = new BankAccount("32682210001421","M Srinu",50000,"Canara Bank",7731981144L);
        cust1.displayCustomerInfo();
        cust1.deposit(60000);
        cust1.withdraw(60000);
        cust1.withdraw(50000);
    }
}