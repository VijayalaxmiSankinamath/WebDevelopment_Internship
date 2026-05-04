class colm5
{
 public static void main(String[] args)
 {
  Object a[]={2,3,4};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   int a1=(int)arr[i];
   int b=(int)arr[i];
   int h=(int)arr[i];
   double res=0.5*(a1+b)*h;
   System.out.println(res);
  }
 }
}