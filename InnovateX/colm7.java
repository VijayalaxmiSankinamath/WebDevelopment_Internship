class colm7
{
 public static void main(String[] args)
 {
  Object a[]={6,4};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   int b=(int)arr[i];
   int h=(int)arr[i];
   int res=b*h;
   System.out.println(res);
  }
 }
}