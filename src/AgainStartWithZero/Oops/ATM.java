package AgainStartWithZero.Oops;

public class ATM {
    private String accountHolderName;
    private double balance;

    ATM(String name,double bal){
        this.accountHolderName = name;
        this.balance = bal;
    }

    // encapsulation ------>  using getter & setter method
    private void setInfo(String name,double bal){
        this.accountHolderName =  name;
        this.balance = bal;
    }

    void show(){
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }

    static void main() {
        ATM atm = new ATM("Virat Kohli",80000000);
        atm.setInfo("Sachin Tendulkar", 100000000);
        atm.show();
    }

}
