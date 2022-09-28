class kapri
{
    public void kap(int num)
    {
        int sq=num*num;
        int p=num;
        int c=0;
        while (p>0)
        {
            c++;
            p/=10;
        }
        int x=(int)Math.pow(10,c);
        System.out.println(x);
        int m=sq%x;
        int n=(sq-m)/x;
        System.out.println(m+"   "+n);
        int z=m+n;
        if (z==num)
        System.out.println("OK");
        else
        System.out.println("Not OK");
    }
}