class colm6
{
 public static void main(String[] args)
 {
  Object a[]={3,4};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   final double pi=3.142;
   int a1=(int)arr[i];
   int b=(int)arr[i];
   double res=pi*a1*b;
   System.out.println(res);
  }
 }
}