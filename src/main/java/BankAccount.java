public class BankAccount {

    private String firstName;

    private String lastName;

    private String  dateOfBirth;

    private int accountNumber;

    private int balance;


    public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, int inputBalance){

        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    // METHODS

// Deposit Method

    public void deposit(int amount){

        balance += amount;
    }


    // Withdrawal Method

    public void withdraw(int amount){

        if (balance >= amount){
            balance -=amount;
        }

        // Pay Interest Method

    public void payInterest(int interestRate){
         balance += (balance * interestRate);

        }

    }

}





