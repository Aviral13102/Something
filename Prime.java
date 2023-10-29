import java.util.Scanner;
public class Prime 
{
    public static boolean isPrime(int x)
    {
        int c=0;
        for(int i=2;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        if(c==1)
        return true;
        else return false;
    }
    public static void main(String args[])
    {
        Scanner av=new Scanner(System.in);
        System.out.println("Enter number");
        int n=av.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(isPrime(i))
             System.out.println(i);
            }
       }
   }
}

