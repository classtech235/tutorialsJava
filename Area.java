class Area
{
  int len,width;
  void qaz(int l, int w)
  {
    len=l;
    width=w;
  }
 void qaz1()
  {
     int a=len*width;
     System.out.println("Area : LxW :"+a);
     if(a>10)
   { 
     System.out.println("Good Land");
   }
   else
   {
    System.out.println("Bad Land"); 
   }
  }
 
}