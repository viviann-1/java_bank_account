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
        String result =bankAccount.getFirstName();
        assertThat(result).isEqualTo("Bob");

    }

    @Test

    public void canReturnLastName(){
        String result =bankAccount.getLastName();
        assertThat(result).isEqualTo("Smith");
    }

    public void canReturnDateOfBirth(){
        String result =bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("01/02/1940");

    }

    @Test

    public void canReturnAccountNumber(){
        int result =bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(1234);

    }


    @Test

    public void canReturnBalance(){
        int result=bankAccount.getBalance();
        assertThat(result).isEqualTo(200);
    }

    @Test

    public void canReturnDeposit(){
        int result=bankAccount.deposit();
        assertThat(result).isEqualTo(200 +=);

    }




    }





