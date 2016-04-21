public class Coin {

  public Integer runCoin(Integer inputCent) {

    Integer penny = 0;

    while (inputCent >= 1) {
      inputCent -= 1;
      penny++;
    }
    return penny;
  }
}
