import java.util.Scanner;
/**
 * Write a description of class HappyNum here.
 * 
 * A happy number is a number in which the eventual
 * sum of the square of the digits of the number is
 * equal to 1.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Happy
{
    static int sumSquareDigit(int n)
    {
        int sum = 0, rem;
        while(n>0)
        {
            rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n, m, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        while(n>9)
        {
            m = sumSquareDigit(n);
        }
        sc.close();
    }
}