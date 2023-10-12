import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;
    private String accountType;
    private double overdraft;

    // Constructor to initialise the account with the deets!
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber, String accountType, double overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // initial balance must start at 0
        this.accountType = accountType;
        this.overdraft = overdraft;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }
    // Setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter for last name
    public String getLastName() {
        return lastName;
    }
    // Setter for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for the date of birth
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    // Setter for the date of birth
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Getter for the account number
    public String getAccountNumber(){
        return accountNumber;
    }
    // Setter for the account number
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    // Getter for the balance
    public double getBalance() {
        return balance;
    }
    // Setter for the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for accountType
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Getter and Setter for overdraft
    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    // Method to deposit money into the account
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid. Please input an integer greater than 0!");
        }
        return amount;
    }

    // Method to withdraw money from the account
//    public double withdrawal(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//        } else {
//            System.out.println("Invalid. Please input an integer greater than 0 and less than your balance!");
//        }
//        return amount;
//    }

    // Modify the withdrawal method to consider overdraft
    public double withdrawal(double amount) {
        if (amount > 0) {
            if (amount <= balance + overdraft) {
                balance -= amount;
            } else {
                System.out.println("Sorry, you don't have enought money :( ");
            }
        } else {
            System.out.println("Invalid. Please input an integer greater than 0!");
        }
        return amount;
    }

    // Method to pay interest of 5%
//    public double payInterest() {
//        balance += 0.05 * balance;
//        return 0;
//    }

    // Modify the payInterest method to adjust interest based on accountType
    public double payInterest() {
        if ("savings".equals(accountType)) {
            balance += 0.05 * balance;
        } else if ("current".equals(accountType)) {
            balance += 0.02 * balance;
        } else {
            System.out.println("Invalid account type.");
        }
        return 0;
    }

}
