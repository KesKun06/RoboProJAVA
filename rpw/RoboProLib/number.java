package rpw.RoboProLib;

public class number {
  public static boolean DigitsOddEven(int num) {
    int x = 0;

    while (num > 0) {
      num /= 10;
      x++;
    }

    if (x % 2 == 0)
      return true;
    else
      return false;
  }
}