package rpw.RoboProLib;

public class number {
  // public static String Ordianl(int num) {
  //   String onest[] = {"", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"};
  //   String tenst[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
  // }

  public static String Word(int num) {
    String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", ""};
  }
  
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

  public static boolean Palindrome(int num) {
    int temp=num, sum=0;

    while (temp > 0) {
      sum = (sum*10) + (temp%10);
      temp /= 10;
    }

    if (num == sum)
      return true;
    else
      return false;
  }

  public static boolean Spy(int num) {
    int sum=0, product=1;

    while (num > 0) {
      sum += num%10;
      product *= num%10;
      num /= 10;
    }

    if (sum == product)
      return true;
    else
      return false;
  }

  public static boolean Armstrong(int num) {
    int temp=num, cube=0;

    while (num > 0) {
      cube += (temp%10) * (temp%10) * (temp%10);
      temp /= 10;
    }

    if (num == cube)
      return true;
    else
      return false;
  }

  public static boolean Perfect(int num) {
    int sum=0;

    for(int i=1 ; i < num ; i++) {
      if(num%i == 0)
        sum += i;
    }

    if (num == sum)
      return true;
    else
      return false;
  }

  public static boolean Niven(int num) {
    int temp=num, sum=0;

    while (num > 0) {
      sum += temp%10;
      temp /= 10;
    }

    if (num%sum == 0)
      return true;
    else
      return false;
  }

  public static int[] Swap(int n1, int n2) {
    n1 = n1 + n2;
    n2 = n1 - n2;
    n1 = n1 - n2;
    int num[] = {n1, n2};
    return num;
  }

  public static int sum() {
    int sum=0;
    
    double n = system.inputDouble("Number of numbers you want to add: ");
    
    for(int i=0 ; i < n ; i++)
      sum += system.inputDouble("Enter "+(i+1)+"number: ");
    
    return sum;
  }
}