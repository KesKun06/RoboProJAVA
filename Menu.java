import rpw.RoboProLib.*;
import School11.*;

public class Menu {
  public void run() {
    boolean repeat = false;
    String options = "1. Creating a new number by swaping consecutive pair of digits of even digits number.\n" +
        "Choose a program: ";

    do {
      int option = system.inputInt(options);

      switch (option) {
        case 1:
          new EvenDigitNumSwap().run();
          new EvenDigitNumSwap().code();
          break;
      }

      repeat = system.inputBool("\n ************************************************************** \n\nDo you want to repeat the program: ");
    } while (repeat);
  }
}