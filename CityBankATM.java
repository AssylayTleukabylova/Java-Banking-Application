package JavaCourse.Project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Account number:");
        String accountNumber = in.nextLine();
        System.out.println("Input pincode:");
        String pinCode = in.nextLine();

        BankAccount bankAccount=null;


        for (int i=0;i<Database.allAccounts.length;i++ ){
                if (Database.allAccounts[i].getAccountNumber().equals(accountNumber) && Database.allAccounts[i].getPinCode().equals(pinCode)) {
                  bankAccount=Database.allAccounts[i];
                  break;
                }
        }
                    if (bankAccount instanceof CityBankAccount) {
                        while (true) {
                            System.out.println(" PRESS [1] TO CASH WITHDRAWAL  // снять деньги\n" +
                                    "\n" +
                                    "               PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                                    "\n" +
                                    "               PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                                    "\n" +
                                    "               PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                                    "\n" +
                                    "               PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                                    "\n" +
                                    "               PRESS [6] TO EXIT // выход");

                            int press = in.nextInt();
                            if (press == 1) {
                                System.out.println("How much money do you want to withdraw?");
                                int newCredit = in.nextInt();
                                bankAccount.creditBalance(newCredit);

                            } else if (press == 2) {
                                System.out.println("Your balance:");
                                System.out.println(bankAccount.totalBalance());

                            } else if (press == 3) {
                                System.out.println("Please, press new pin-code");
                                bankAccount.setPinCode(pinCode);
                            } else if (press == 4) {
                                System.out.println("Please insert the bills");
                                int newDebet = in.nextInt();
                                bankAccount.debetBalance(newDebet);
                            } else if (press == 5) {
                                bankAccount.accountData();

                            } else if (press == 6) {
                                break;
                            }
                        }

                    } else {
                        while (true) {
                            System.out.println(" PRESS [1] TO CASH WITHDRAWAL\n" +
                                    "\n" +
                                    "               PRESS [2] TO VIEW BALANCE\n" +
                                    "\n" +
                                    "               PRESS [3] TO EXIT");
                            int pressForOtherClass = in.nextInt();
                            if (pressForOtherClass == 1) {
                                System.out.println("How much money do you want to withdraw?");
                                int newCredit = in.nextInt();
                                assert bankAccount != null;
                                bankAccount.creditBalance(newCredit);
                            } else if (pressForOtherClass == 2) {
                                System.out.println("Your balance:");
                                assert bankAccount != null;
                                System.out.println(bankAccount.totalBalance());
                            } else if (pressForOtherClass == 3) {
                                break;
                            }
                        }
                    }
                }
            }

