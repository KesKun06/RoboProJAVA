public class nave
{
  public static void main(int n)
  {
    int k=0,l=0;
      
    for(int i=1;i<=n;i++)
    {
        System.out.println();
        k=n-i;
            {
                 for(int m=1;m<=n-k;m++)
              {
                 System.out.print("1,");
              }
              
            System.out.print(k);
            
         }
    }
    for(int j=2;j<=n;j++)
        {
              System.out.println();
        l=n-j;
        System.out.print(j+","+l);
    }
    
}
}