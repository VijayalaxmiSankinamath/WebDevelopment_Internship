class colr1
{
 static Object[] area()
 {
  Object arr[]={3,5};
  Object res[]=new Object[arr.length];

  for(int i=0;i<arr.length;i++)
  {
   final double pi=3.142;
   int r=(int)arr[i];
   double re=pi*r*r;
   res[i]=re;
  }

  return res;
 }

 public static void main(String[] args)
 {
  Object x[]=area();

  for(int i=0;i<x.length;i++)
   System.out.println(x[i]);
 }
}