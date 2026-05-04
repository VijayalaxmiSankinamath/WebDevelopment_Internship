class colm4
{
 public static void main(String[] args)
 {
  Object a[]={2,4};
  area(a);
 }

 static void area(Object arr[])
 {
  for(int i=0;i<arr.length;i++)
  {
   int s=(int)arr[i];
   int res=s*s;
   System.out.println(res);
  }
 }
}