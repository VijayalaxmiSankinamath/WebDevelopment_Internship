class colr8
{
 static Object[] area()
 {
  Object arr[]={5};
  Object res[]=new Object[arr.length];

  for(int i=0;i<arr.length;i++)
  {
   int r=(int)arr[i];
   int theta=60;
   double re=0.5*r*r*theta;
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