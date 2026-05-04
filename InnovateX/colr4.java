class colr4
{
 static Object[] area()
 {
  Object arr[]={4,6};
  Object res[]=new Object[arr.length];

  for(int i=0;i<arr.length;i++)
  {
   int a=(int)arr[i];
   int re=a*a;
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