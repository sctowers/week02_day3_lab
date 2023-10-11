import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;

    // Constructor to initialise the account with the deets!
    public BankAccount(String suzi, String towers, LocalDate localDate, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // initial balance must start at 0
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
    public double withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid. Please input an integer greater than 0 and less than your balance!");
        }
        return amount;
    }

    // Method to pay interest of 5%
    public double payInterest() {
        balance += 0.05 * balance;
        return 0;
    }

}
