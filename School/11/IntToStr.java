import java.util.Scanner;
/**
 * Write a description of class IntToStr here.
 * 
 * A program that converts integer value to number in words.
 *
 * @author Keshav Kundan
 * @version 1.2.5
 */
public class IntToStr 
{
    public static void main(String[] args) 
    {
        boolean repeat = false;
        Scanner sc = new Scanner(System.in);
        do
        {            
            int num;
            String n;
            String ones[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
            String tens[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
            
            System.out.print("\nEnter a number (0 - 100000): ");
            num = sc.nextInt();
            
            if (num < 100000 && num > 0)
            {
                System.out.print("Number (in words): ");
                if (num % 1000 == 0)
                    System.out.println(((num / 1000) < 20 ? ones[num / 1000] : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10]) + " Thousand");
                else if (num % 100 == 0 && num / 100 < 100)
                    System.out.println(ones[num / 100] + " Hundred");
                else if (num % 10 == 0 && num / 10 < 10)
                    System.out.println(tens[num / 10]);
                else if (num < 20)
                    System.out.println(ones[num]);
                else
                {
                    n = num / 1000 != 0 ? ((num / 1000) < 20 ? ones[num / 1000] : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10]) + " Thousand " : "";
                    n += (num % 1000) / 100 != 0 ? ones[((num % 1000) / 100) % 10] + " Hundred " : "";
                    n += num % 100 < 20 ? ones[num % 100] : tens[((num % 1000) % 100) / 10] + " " + ones[((num % 1000) % 100) % 10];
                    System.out.println(n);
                }
            } else
                System.out.println("Out of Range.");
                
            System.out.println("\nWant to repeat the program: ");
            repeat = sc.nextInt() == 1;
        } while (repeat);
        sc.close();
    }
}