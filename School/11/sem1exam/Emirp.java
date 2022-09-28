class Emirp
{
    int n,rev,f;
    public Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    public int isPrime(int x)
    {
        if (x%f==0)
        {
            f=2;
            return 0;
        }
        else 
        {
            f++;
            if (f<x)
            return isPrime(x);
            else
            {
                 f=2;
                return 1;
            }
        }
    }
    public void isEmrip()
    {
        int temp=n;
        while (temp>0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if (isPrime(n)==1 && isPrime(rev)==1)
        System.out.println("Emrip Number....");
        else
        System.out.println("This is not an Emrip Number....");
    }
}