import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    // Constructor to initialise the account with the deets
    public BankAccount() {
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
    public void getLastName(String lastName) {
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
    public int getAccountNumber(){
        return accountNumber;
    }
    // Setter for the account number
    public void setAccountNumber(int accountNumber){
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

    // Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid. Please input an integer greater than 0!");
        }
    }

    //
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid. Please input an integer greater than 0 and less than your balance!");
        }

        public void payInterest() {
            balance += 0.05 * balance;
        }
    }
}
