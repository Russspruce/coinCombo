public class Coin {

  public String runCoin(Integer inputCent) {

    // Integer change = 0;
    Integer quarter = 0;
    Integer dime = 0;
    Integer nickel = 0;
    Integer penny = 0;
    String exchange = "";

    while (inputCent / 25 >= 1) {
      inputCent -= 25;
      quarter++;
      // exchange = quarter.toString() + " quarter(s)"
    }
    while (inputCent / 10 >= 1) {
      inputCent -= 10;
      dime++;
    }
    while (inputCent / 5 >= 1) {
      inputCent -= 5;
      nickel++;
    }
    while (inputCent / 1 >= 1) {
      inputCent -= 1;
      penny++;
    }

    return exchange = String.format("%d Quarter(s), %d Dime(s), %d Nickel(s) and %d Penny(s)", quarter, dime, nickel, penny);
  //   while (inputCent != 0) {
   //
  //     if (inputCent >= 5) {
  //      inputCent -= 5;
  //      nickel++;
   //
  //      change += nickel;
  //     }
  //
  //     else if (inputCent >= 1) {
  //      inputCent -= 1;
  //      penny++;
   //
  //      change += penny;
  //   }
  //  }
  //  return change;
 }
}




// public class Coin {
//
//   public String runCoin(String inputCent) {
//     String input = inputCent;
//     Integer change = 0;
//     Integer nickel = 0;
//     Integer penny = 0;
//
//     while (inputCent > 0) {
//
//       if (inputCent >= 5) {
//        inputCent -= 5;
//        nickel++;
//
//        change += nickel;
//
//
//       }
//       else if (inputCent >= 1) {
//        inputCent -= 1;
//
//        penny++;
//
//       change += penny;
//     }
//   }
//   String returnValue = "works";
//   if (input==returnValue){
//   }
//   else {
//     returnValue = "no";
//   }
//   return returnValue;
//  }
// }
