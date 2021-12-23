package JavaCourse.Project;

import java.util.Scanner;

public class NationalBankAccount implements BankAccount{
    protected String fullName;
    protected int balance;
    protected String accountNumber;
    protected String pinCode;

    Scanner in=new Scanner(System.in);
    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {

        String newPincode=in.nextLine();
        String temp=pinCode;
        pinCode=newPincode;
        newPincode=temp;
        System.out.println("Your pincode is change");
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        this.balance-=credit-200;
        System.out.println("Your money has been withdrawn (You lose another 200tg from the withdrawn amount)");
    }

    @Override
    public void debetBalance(int debet) {
        this.balance+=debet;
        System.out.println("Your money has been added");
    }


    @Override
    public void accountData() {
        System.out.println("NationalBankAccount:" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode+ '\'');
    }
}
