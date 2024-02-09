import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BankAccountTest {


    private BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Bob", "Smith", "01/02/1940", 1234, 200);
    }

    @Test
    public void canReturnFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Bob");
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("John");
        assertThat(bankAccount.getFirstName()).isEqualTo("John");
    }

    @Test
    public void canReturnLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Smith");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Woods");
        assertThat(bankAccount.getLastName()).isEqualTo("Woods");
    }

    @Test
    public void canReturnDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("01/02/1940");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("10/05/1930");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("10/05/1930");
    }

    @Test
    public void canReturnAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(1234);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(4567);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(4567);
    }
    @Test
    public void canReturnBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(200);
    }
    @Test
    public void canSetBalance(){
        bankAccount.setBalance(500);
        assertThat(bankAccount.getBalance()).isEqualTo(500);
    }
    @Test
    public void canReturnDeposit(){
        bankAccount.deposit(30);
        assertThat(bankAccount.getBalance()).isEqualTo(230);
    }
    @Test
    public void canWithdraw(){
        bankAccount.withdraw(30);
        assertThat(bankAccount.getBalance()).isEqualTo(170);
    }
    @Test
    public void canPayInterest(){
        bankAccount.payInterest(10.0);
        assertThat(bankAccount.getBalance()).isEqualTo(2200);
    }

    }





