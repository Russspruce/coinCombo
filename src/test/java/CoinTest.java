import org.junit.*;
import static org.junit.Assert.*;

public class CoinTest {

  @Test
  public void convertCents_returnPenny_one() {
    Coin testExchangeCoin = new Coin();
    String expected = "1 penny(s)";
    assertEquals(expected, testExchangeCoin.runCoin(1));
  }

  @Test
  public void convertCents_returnNickel_one() {
    Coin testExchangeCoin = new Coin();
    String expected = "1 nickel, ";
    assertEquals(expected, testExchangeCoin.runCoin(5));
  }

  @Test
  public void convertCents_returnDime_two() {
    Coin testExchangeCoin = new Coin();
    String expected = "2 dime(s), 4 penny(s)";
    assertEquals(expected, testExchangeCoin.runCoin(24));
  }

  @Test
  public void convertCents_returnQuarter_three() {
    Coin testExchangeCoin = new Coin();
    String expected = "3 quarter(s), 2 dime(s), 4 penny(s)";
    assertEquals(expected, testExchangeCoin.runCoin(99));
  }

}
