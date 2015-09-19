
public class Account {

   private Customer customer;
   private int accountNumber;
   private double balance;
   private String branch;

   public Account(Customer customer, int accountNumber, String branch){
        this.customer=customer;
        this.accountNumber=accountNumber;
        this.branch=branch;
        balance=0;
   }
   public Account(Customer customer, int accountNumber, double balance){
        this.customer=customer;
        this.accountNumber=accountNumber;
        this.balance=balance;
   }
   public String getCustomerName(){return customer.getName();}
   public void setBranch(String branch){this.branch=branch;}
   public void setBalance(double balance){this.balance=balance;}
   public String getBranch(){return branch;}
   public int getAccountNumber(){return accountNumber;}
   public double getBalance(){return balance;}
   public void credit(double c){ balance+=c;}
   public void debit(double d){
        if(balance>d)
        balance-=d;
        else
        {
        System.out.println("Amount withdrawn exceeds the current balance!\n");
        }
   }
   public void print(){
        System.out.println("Customer: "+getCustomerName()+" Branch: "+branch+" A/C no: "+accountNumber+" Balance: "+balance+"\n");
   }
   public Customer getCustomer(){return customer;}
}
