public class count
{
public static void qaz(int n)
{
   int i;
   int sum=0;
   int sum1=0;
   for(i=1;i<=n;i++)
   {
     if(i%2==0)
     {
     System.out.println(i+"even numbers...");
     sum=sum+i;    
     }
       
     else
     {
     System.out.println(i+"odd numbers...");
     sum1=sum1+i;
     }
    
    }
     System.out.println("sum of even numbers::"+sum);
     System.out.println("sum of odd numbers::"+sum1);
      int diff;
      diff =sum - sum1;
     System.out.println("Differences between even and odd::"+diff);
   
}

public static void main(String[] args)
{
   qaz(20);
}
}
