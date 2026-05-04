class colr6
{
 static Object[] area()
 {
  Object arr[]={3,4};
  Object res[]=new Object[arr.length];

  for(int i=0;i<arr.length;i++)
  {
   final double pi=3.142;
   int a=(int)arr[i];
   int b=(int)arr[i];
   double re=pi*a*b;
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