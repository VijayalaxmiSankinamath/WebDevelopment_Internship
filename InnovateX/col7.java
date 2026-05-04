class col7
{
 public static void main(String[] args)
 {
  area();
 }

 static void area()
 {
  Object arr[]={1,3,5};

  for(int i=0;i<arr.length;i++)
  {
   int a=(int)arr[i];
   int b=(int)arr[i];
   final double pi=3.142;
   double res=pi*a*b;
   System.out.println(res);
  }
 }
}