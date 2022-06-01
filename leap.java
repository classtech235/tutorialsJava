public class leap
{
public static void qaz(int year)
{
if((year%400==0)||(year%4==0 && year%100 !=0))
  {
    System.out.println("Leap Year");
  }
  else
  {
   System.out.println("Not Leap Year");
  }
}
}

