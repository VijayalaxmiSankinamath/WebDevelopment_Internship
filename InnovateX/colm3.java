class colm3
{
 public static void main(String[] args)
 {
  Object a[]={5,3};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   int w=(int)arr[i];
   int h=(int)arr[i];
   int res=w*h;
   System.out.println(res);
  }
 }
}