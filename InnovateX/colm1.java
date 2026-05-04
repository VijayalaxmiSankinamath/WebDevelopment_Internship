class colm1
{
 public static void main(String[] args)
 {
  Object a[]={10,20};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   final double pi=3.142;
   int r=(int)arr[i];
   double res=pi*r*r;
   System.out.println(res);
  }
 }
}