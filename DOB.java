import java.util.Scanner;
class DOB
{
     public static void main(String args[])
     {
     Scanner av=new Scanner(System.in);
     System.out.println("Enter ddmmyyyy");
     String dob=av.next();
     int l=dob.length();
     for(int i=0;i<=2;i++)
     {
          char ch=dob.charAt(i);
          if(Character.isLetter(ch))
         {
          System.out.println("Invalid Input");
          System.exit(0);
         }
     } 
     int n=Integer.parseInt(dob);
     int sum=0;
     for(int j=0;j<=2;j++)
     {
          char c=dob.charAt(j);
          String.valueOf(c);
          sum=sum+c;
     }
     if(sum%10==0)
     System.out.println("Lucky number");
     else
     System.out.print("Not a lucky number");
     }
}