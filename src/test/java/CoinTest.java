import org.junit.*;
import static org.junit.Assert.*;

public class CoinTest {

  @Test
  public void convertCents_returnPenny_one() {
    Coin testExchangeCoin = new Coin();
    Integer expected = 2;
    assertEquals(expected, testExchangeCoin.runCoin(1));
  }

}
