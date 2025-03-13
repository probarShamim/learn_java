//9.7 problem

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //No_args constructor
    Account(){
        this(0,0);
    }
    //args constructor
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    //Accessor
    int getId(){
        return id;
    }

    double getBalance(){
        return balance;
    }

    //set value
    void setId(int id){
        this.id = id;
    }

    void setBalence(int balance){
        this.balance = balance;
    }

    void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate /( 12 * 100);
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    //withdraw
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    //deposit
    void deposit(double amount) {
        balance += amount;
    }

    //main
    public static void main(String[] args){
        Account a1 = new Account(1122,20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance: $" + a1.getBalance());
        System.out.println("Monthly Interest: $" + a1.getMonthlyInterest());
        System.out.println("Date Created: " + a1.getDateCreated());    }

}
