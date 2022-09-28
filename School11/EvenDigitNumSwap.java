package School11;

import rpw.RoboProLib.*;

public class EvenDigitNumSwap {
  public void run() {
    system.print("\n ****************>> EvenDigitNumSwap Output: <<**************** \n");
    int num, temp, x = 0;
    String n = "";

    num = system.inputInt("Enter a number with even digits: ");

    if (number.DigitsOddEven(num)) {
      temp = num;

      while (temp > 0) {
        x = temp % 100;
        n = ((x % 10) * 10 + (x / 10)) + n;
        temp /= 100;
      }

      system.print("\n" + num
          + " is an even digit number.\nThe new number formed after swaping consecutive pair of digits is: " + n);
    } else {
      system.print(num + " is not an even digit number.");
    }
  }

  public void code() {
    String program = "\n *****************>> EvenDigitNumSwap Code: <<***************** \n\n" +
        "int num, temp, x = 0;\n" +
        "String n = \"\";\n" +
        "\n" +
        "Scanner sc = new Scanner(System.in);\n" +
        "\n" +
        "System.out.print(\"Enter a number with even digits: \", \"\");\n" +
        "num = sc.nextInt();\n" +
        "\n" +
        "temp = num;\n" +
        "while(temp>0) {\n" +
        "  temp /= 10;\n" +
        "  x++\n" +
        "}\n" +
        "\n" +
        "if (x%2 == 0) {\n" +
        "  temp = num;\n" +
        "\n" +
        "  while (temp > 0) {\n" +
        "    x = temp % 100;\n" +
        "    n = ((x % 10) * 10 + (x / 10)) + n;\n" +
        "    temp /= 100;\n" +
        "  }\n" +
        "\n" +
        "  System.out.println(\"\\n\"+num + \" is an even digit number.\\nThe new number formed after swaping consecutive pair of digits is: \" + n);\n"
        +
        "} else {\n" +
        "  System.out.println(num + \" is not an even digit number.\");\n" +
        "}\n";
    system.print(program);
  }
}