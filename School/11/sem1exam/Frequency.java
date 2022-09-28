class Frequency
{
public void work (String str)
{
//Frequency of alphabets...
    char ch;
    int f=0;
    str=str.toUpperCase();
    int l=str.length();
    for(int i=65;i<=90;i++)
    {
        
        for (int j=0;j<l;j++)
        {
            ch =str.charAt(j);
            if((int)ch==i)
                f=f+1;
        }
        if (f>0)
        System.out.println((char)i+" =" +f);
        f=0;
    }
}
}