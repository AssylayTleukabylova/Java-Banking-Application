package JavaCourse.Project;

public class Database {

    public static BankAccount[] allAccounts = new BankAccount[10];

    static{

        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",10322312,"0102", "20000");

        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",10322313,"0101", "10000");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",101112,"0102", "2000");
    }

    public static BankAccount[] getAllAccounts() {
        return allAccounts;
    }

    public static void setAllAccounts(BankAccount[] allAccounts) {
        Database.allAccounts = allAccounts;
    }

}
