public class Account {

    private String id;
    private String name;
    private int balance=0;


//Constructor with id and name
public Account(String id, String name){
    this.id = id;
    this.name = name;
}
    //Constructor with id, name and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public void setId (String id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }




//get

    public String getId() {
    return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    public int credit(int amount) {
    if (amount<0){
        System.out.println("Invalid, please try again");
    }
    balance = balance + amount;
    return balance;
    }


    public int debit(int amount) {
        if(amount > 0) {
            if (amount <= balance){
            balance = balance - amount;
        }else {
        System.out.println("Insufficient funds, Amount exceeded balance!");
    }
        }
    return balance;
    }


    public int transferTo ( Account another, int amount) {
    if(amount > 0 && amount <= balance){
     this.debit(amount);}
     else{
            System.out.println("Transfer amount invalid or exceeded balance!");
        }
     return balance;
    }


    public String toString(){
    return "Account ID: " + id + ", Name: " + name + ", Balance: " + balance;
    }







}
