import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

public class TestBankAccount {

    // Testing first name getter and setter
    @Test
    public void testFirstNameGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setFirstName("Suzi");
        // Then
        String expectedFirstName = "Suzi";
        assertThat(account.getFirstName()).isEqualTo(expectedFirstName);
    }


    // Testing last name getter and setter
    @Test
    public void testLastNameGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setLastName("Towers");
        // Then
        String expectedLastName = "Towers";
        assertThat(account.getLastName()).isEqualTo(expectedLastName);
    }

    // Testing date of birth getter and setter
    @Test
    public void testDateOfBirthGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setDateOfBirth(LocalDate.of(2001, 12, 14));
        // Then
        LocalDate expectedDateOfBirth = LocalDate.of(2001,12,14);
        assertThat(account.getDateOfBirth()).isEqualTo(expectedDateOfBirth);
    }

    // Testing account number getter and setter
    @Test
    public void testAccountNumberGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setAccountNumber("146133");
        // Then
        String expectedAccountNumber = "146133";
        assertThat(account.getAccountNumber()).isEqualTo(expectedAccountNumber);
    }

    // Testing Balance getter and setter
    @Test
    public void testBalanceGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setBalance(2000.0);
        // Then
        double expectedBalance = 2000.0;
        assertThat(account.getBalance()).isEqualTo(expectedBalance);

    }

    // Testing account type getter and setter
    @Test
    public void testAccountTypeGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.setAccountType("savings");
        // Then
        String expectedAccountType = "savings";
        assertThat(account.getAccountType()).isEqualTo(expectedAccountType);
    }

    // Testing overdraft getter and setter
    @Test
    public void testOverdraftGetterAndSetter() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        //When
        account.setOverdraft(1000.0);
        //Then
        double expectedOverdraft = 1000.0;
        assertThat(account.getOverdraft()).isEqualTo(expectedOverdraft);
    }

    // Test the initial account setup
    @Test
    public void testInitialBalance() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When (N/A)

        // Then
        double expectedBalance = 0.0;
        assertThat(account.getBalance()).isEqualTo(expectedBalance);
    }

    // Test the deposit method
    @Test
    public void testDeposit() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        // When
        account.deposit(2000.0);
        // Then
        double expectedBalance = 2000.0;
        assertThat(account.getBalance()).isEqualTo(expectedBalance);
    }

    // Test the withdrawal method
    @Test
    public void testWithdrawal() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        account.deposit(2000.0);
        // When
        account.withdrawal(300.0);
        // Then
        double expectedBalance = 1700.0;
        assertThat(account.getBalance()).isEqualTo(expectedBalance);
    }

    // Test the 5% interest payment method
    @Test
    public void testPayInterest() {
        // Given
        BankAccount account = new BankAccount("Suzi", "Towers", LocalDate.of(2001, 12, 14), "146133", "savings", 1000.0);
        account.deposit(2000.0);
        // When
        account.payInterest();
        // Then
        double expectedBalance = 2100.0;
        assertThat(account.getBalance()).isEqualTo(expectedBalance);
    }
}
