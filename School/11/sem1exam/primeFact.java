//print all prime factors of a given number.
//eg : 24=2*2*2*3
class primeFact
{
    public void pF(int N)
    {
        int x=N,c=2;
        while (x>1)
        {
            if (x%c==0)
            {
                System.out.println(c);
                x=x/c;
            }
            else
            c++;
        }
    }
}