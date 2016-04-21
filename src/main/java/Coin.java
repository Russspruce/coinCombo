public class Coin {

  public String runCoin(Integer inputCent) {

    Integer quarter = 0;
    Integer dime = 0;
    Integer nickel = 0;
    Integer penny = 0;
    String exchange = "";

    while (inputCent / 25 >= 1) {
      inputCent -= 25;
      quarter++;
    }
    if (quarter != 0) {
      exchange = quarter.toString() + " quarter(s), ";
    }

    while (inputCent / 10 >= 1) {
      inputCent -= 10;
      dime++;
    }
    if (dime != 0) {
      exchange += dime.toString() + " dime(s), ";
    }
    while (inputCent / 5 >= 1) {
      inputCent -= 5;
      nickel++;
    }
    if (nickel != 0) {
      exchange += nickel.toString() + " nickel, ";
    }
    while (inputCent / 1 >= 1) {
      inputCent -= 1;
      penny++;
    }
    if (penny != 0) {
      exchange += penny.toString() + " penny(s)";
    }

    return exchange;
 }
}
