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
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    // METHODS

// Deposit Method

    public void deposit(int amount){
        this.balance += amount;
    }

    // Withdrawal Method

    public void withdraw(int amount){
            this.balance -=amount;
        }

        // Pay Interest Method

    public void payInterest(double interestRate){
            double interestToPay = this.balance * interestRate;
            this.balance += interestToPay;



        }

    }







