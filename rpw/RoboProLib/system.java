package rpw.RoboProLib;

import java.util.Scanner;

public class system {
  public static Scanner sc = new Scanner(System.in);

  public static void print(String x) {
    System.out.println(x);
  }

  public static void print(String x, String end) {
    System.out.print(x + end);
  }

  public static String input() {
    return sc.next();
  }

  public static char inputChar() {
    return sc.next().charAt(0);
  }

  public static String inputLine() {
    return sc.nextLine();
  }

  public static int inputInt() {
    return sc.nextInt();
  }

  public static double inputDouble() {
    return sc.nextDouble();
  }

  public static float inputFloat() {
    return sc.nextFloat();
  }

  public static boolean inputBool() {
    return sc.nextBoolean();
  }

  public static String input(String x) {
    System.out.print(x);
    return sc.next();
  }

  public static char inputChar(String x) {
    System.out.print(x);
    return sc.next().charAt(0);
  }

  public static String inputLine(String x) {
    System.out.print(x);
    return sc.nextLine();
  }

  public static int inputInt(String x) {
    System.out.print(x);
    return sc.nextInt();
  }

  public static double inputDouble(String x) {
    System.out.print(x);
    return sc.nextDouble();
  }

  public static float inputFloat(String x) {
    System.out.print(x);
    return sc.nextFloat();
  }

  public static boolean inputBool(String x) {
    System.out.print(x);
    return sc.nextBoolean();
  }
}