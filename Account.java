import java.security.PrivateKey;

public class Account {
    private String id;
    private String name;
    private int balance = 0;


    public Account(){

    }
    public Account(String id, String name){
        this.id =id;
        this.name =name;
    }

    public Account(String id ,String name,int balance){
        this.id =id;
        this.name =name;
        this.balance=balance;
    }

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }
    public void setId(){
        this.id =id;
    }
    public void setName(){
        this.name =name;
    }
    public void setBalance(int balance){
        this.balance =balance;
    }

    //add
    public int credit(int amount){
        balance += amount;
        return amount;
    }

    //withdraw
    public int debit(int amount){
        if (balance > 0 && !(amount > balance)){
            balance -= amount;
        }
        else System.out.println("Insufficient balance, balance: "+balance);
        return amount;
    }

    public int transferTo(Account another,int amount){
        if ( amount <= getBalance()) {
            int a = another.getBalance() + amount;
            another.setBalance(a);
            debit(amount);
        }
        else System.out.println(amount+" Transfered amount cannot be less than "+getBalance());
        return amount;
    }
    public String toString(){
        return "ID:"+getID()+", Name: "+getName()+", Balance: "+getBalance();
    }
}
