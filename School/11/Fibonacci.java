import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int num, n1=0, n2=1, n3=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("F0" + " = " + 0);
        System.out.println("F1" + " = " + 1);
        for (int i=2 ; i<num ; i++)
        {
            //if (i == 47)
            //{
            //    System.out.println(n1+n2+" "+n2+" "+n3);
            //}
            n3 = n1 + n2;
            System.out.println("F" + i + " = " + n3);
            n1 = n2;
            n2 = n3;
            sum += n3;
            //if (i == 47)
            //{
            //    System.out.println(n1+" "+n2+" "+n3);
            //}
        }
        System.out.println("\n"+sum);
        //System.out.println(1134903170 + 1836311903);
        sc.close();
    }
}