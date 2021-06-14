package edu.cnm.deepdive;

/*

We are having a party with amounts of tea and candy.
Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
 */

public class CodingBatATeaParty {

  public static void main(String[] args) {

    System.out.printf("if tea is %s and candy is %d, the outcome is " + teaParty(6, 8) + ".\n", 6, 8);
    System.out.printf("if tea is %s and candy is %d, the outcome is " + teaParty(3, 8) + ".\n", 3, 8);
    System.out.printf("if tea is %s and candy is %d, the outcome is " + teaParty(20, 6) + ".\n", 20, 6);

  }

  public static int teaParty(int tea, int candy) {
    if ((tea >= 2 * candy && candy > 4) || (candy >= tea * 2 && tea > 4)) {
      return 2;
    } else if (tea >= 5 && candy >= 5) {
      return 1;
    } else {
      return 0;
    }
  }
}
