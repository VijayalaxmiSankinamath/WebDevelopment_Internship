class colr7
{
 static Object[] area()
 {
  Object arr[]={6,4};
  Object res[]=new Object[arr.length];

  for(int i=0;i<arr.length;i++)
  {
   int b=(int)arr[i];
   int h=(int)arr[i];
   int re=b*h;
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