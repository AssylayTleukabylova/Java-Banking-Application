package JavaCourse.Project;

import java.util.Scanner;

public class CityBankAccount implements BankAccount{
   protected String name;
   protected String surname;
   protected int balance;
   protected String accountNumber;
   protected String pinCode;

   Scanner in=new Scanner(System.in);

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        this.balance-=credit;
        System.out.println("Your money has been withdrawn");
    }

    @Override
    public void debetBalance(int debet) {
        this.balance+=debet;
        System.out.println("Your money has been added");
    }


    @Override
    public void accountData() {
        System.out.println( "CityBankAccount:" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'');
    }
}
